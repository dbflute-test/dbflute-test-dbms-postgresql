-- #df:checkEnv(df:default)#

-- =======================================================================================
--                                                                             Master Data
--                                                                             ===========
-- #df:assertEquals(MemberStatus)#
select MEMBER_STATUS_CODE as KEY, MEMBER_STATUS_NAME, DISPLAY_ORDER
  from member_status
 order by KEY
;

-- #df:assertTableEquals(TableCls, suffix:_STATUS, except:DESCRIPTION)#
select 'dummy'
;
