package org.docksidestage.postgresql.dbflute.vendor;

import java.sql.Timestamp;
import java.util.Set;

import org.dbflute.exception.EntityAlreadyUpdatedException;
import org.dbflute.helper.HandyDate;
import org.dbflute.utflute.core.cannonball.CannonballCar;
import org.dbflute.utflute.core.cannonball.CannonballOption;
import org.dbflute.utflute.core.cannonball.CannonballRun;
import org.dbflute.util.DfCollectionUtil;
import org.docksidestage.postgresql.dbflute.cbean.MemberCB;
import org.docksidestage.postgresql.dbflute.exbhv.MemberBhv;
import org.docksidestage.postgresql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.postgresql.dbflute.exentity.Member;
import org.docksidestage.postgresql.dbflute.exentity.Purchase;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.1 (2009/06/20 Saturday)
 */
public class VendorLockTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    @Override
    protected boolean isSuppressTestCaseTransaction() {
        return true;
    }

    // ===================================================================================
    //                                                                              Insert
    //                                                                              ======
    public void test_insert_after_empty_queryDelete_nonDeadlock() {
        final Set<String> markSet = DfCollectionUtil.newHashSet();
        final Set<Integer> insertedIdSet = DfCollectionUtil.newHashSet();
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                long threadId = Thread.currentThread().getId();

                // empty delete (update, for update) locks new record
                // (if it deletes existing records, second waits)
                MemberCB cb = new MemberCB();
                cb.query().setMemberId_Equal(99999);
                memberBhv.queryDelete(cb);

                Member inserted = memberBhv.selectByPK(3).get();
                inserted.setMemberAccount(threadId + ":" + inserted.getMemberId());
                inserted.setMemberId(null);
                memberBhv.insert(inserted);
                markSet.add("success: " + threadId);
                insertedIdSet.add(inserted.getMemberId());
            }
        }, new CannonballOption().commitTx().expectSameResult().finalizer(() -> {
            if (!insertedIdSet.isEmpty()) {
                MemberCB cb = new MemberCB();
                cb.query().setMemberId_InScope(insertedIdSet);
                memberBhv.queryDelete(cb);
            }
        }));
        log(markSet);
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_update_before_insert_alreadyUpdated() {
        final int memberId = 3;
        final Member before = memberBhv.selectByPK(memberId).get();
        final Long versionNo = before.getVersionNo();
        final Set<String> markSet = DfCollectionUtil.newHashSet();
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                Member member = new Member();
                member.setMemberId(memberId);
                member.setVersionNo(versionNo);
                memberBhv.update(member);
                final int entryNumber = car.getEntryNumber();
                for (int i = 0; i < 30; i++) {
                    Purchase purchase = new Purchase();
                    purchase.setMemberId(memberId);
                    purchase.setProductId((int) (entryNumber % 10) + 1);
                    long currentMillis = currentTimestamp().getTime();
                    long keyMillis = currentMillis - (entryNumber * 10000) - (i * 10000);
                    HandyDate handyDate = new HandyDate(new Timestamp(keyMillis));
                    purchase.setPurchaseDatetime(handyDate.addDay(entryNumber).getLocalDateTime());
                    purchase.setPurchaseCount(1234 + i);
                    purchase.setPurchasePrice(1234 + i);
                    purchase.setPaymentCompleteFlg_True();
                    purchaseBhv.insert(purchase);
                }
                markSet.add("success: " + entryNumber);
            }
        }, new CannonballOption().commitTx().expectExceptionAny(EntityAlreadyUpdatedException.class));
        log(markSet);
    }

    public void test_update_after_insert_mayBeDeadlock() {
        final Purchase source = purchaseBhv.selectByPK(1L).get();
        source.setPurchaseId(null);
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                int entryNumber = car.getEntryNumber();
                Purchase purchase = source.clone();
                purchase.setMemberId(entryNumber % 2 == 1 ? 3 : 4);
                purchase.setProductId(entryNumber % 3 == 1 ? 3 : (entryNumber % 3 == 2 ? 4 : 5));
                long keyMillis = currentTimestamp().getTime() - (entryNumber * 1000);
                purchase.setPurchaseDatetime(toLocalDateTime(keyMillis));
                purchaseBhv.insert(purchase);

                // deadlock if update is executed after insert including updateNonstrict()
                // ShareLock and ExclusiveLock are points
                Member member = new Member();
                member.setMemberId(3);
                memberBhv.updateNonstrict(member);
                markHere("success");
            }
        }, new CannonballOption().commitTx().repeatCount(5).expectExceptionAny("deadlock detected"));
        assertMarked("success");
    }

    // ===================================================================================
    //                                                                          For Update
    //                                                                          ==========
    public void test_forUpdate_existingValue() throws Exception {
        cannonball(car -> {
            car.projectA(dragon -> {
                dragon.expectNormallyDone();
                memberBhv.selectEntity(cb -> {
                    cb.query().setMemberId_Equal(3);
                    cb.lockForUpdate();
                });
            }, 1);
            car.projectA(dragon -> {
                dragon.expectOvertime();
                memberBhv.selectEntity(cb -> {
                    cb.query().setMemberId_Equal(3);
                    cb.lockForUpdate();
                });
            }, 2);
        }, new CannonballOption().threadCount(2));
    }

    public void test_forUpdate_notExistingValue() throws Exception {
        cannonball(car -> {
            car.projectA(dragon -> {
                dragon.expectNormallyDone();
                memberBhv.selectEntity(cb -> {
                    cb.query().setMemberId_Equal(99999);
                    cb.lockForUpdate();
                });
            }, 1);
            car.projectA(dragon -> {
                dragon.expectNormallyDone(); /* no wait */
                memberBhv.selectEntity(cb -> {
                    cb.query().setMemberId_Equal(99999);
                    cb.lockForUpdate();
                });
            }, 2);
        }, new CannonballOption().threadCount(2));
    }
}
