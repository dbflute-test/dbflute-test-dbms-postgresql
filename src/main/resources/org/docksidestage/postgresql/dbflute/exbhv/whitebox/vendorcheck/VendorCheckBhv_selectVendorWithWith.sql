-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!

with sea as (select VENDOR_CHECK_ID, TYPE_OF_VARCHAR from VENDOR_CHECK)
   , land as (select VENDOR_CHECK_ID, TYPE_OF_NUMERIC_INTEGER from VENDOR_CHECK)
select vendor.VENDOR_CHECK_ID
     , sea.TYPE_OF_VARCHAR
     , land.TYPE_OF_NUMERIC_INTEGER
  from VENDOR_CHECK vendor
    inner join sea on vendor.VENDOR_CHECK_ID = sea.VENDOR_CHECK_ID
    inner join land on vendor.VENDOR_CHECK_ID = land.VENDOR_CHECK_ID
