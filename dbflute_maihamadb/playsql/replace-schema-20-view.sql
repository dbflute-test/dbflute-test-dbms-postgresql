
create view SUMMARY_PRODUCT as
select product.PRODUCT_ID
     , product.PRODUCT_NAME
     , product.PRODUCT_STATUS_CODE
     , (select max(purchase.PURCHASE_DATETIME)
          from PURCHASE purchase
         where purchase.PRODUCT_ID = product.PRODUCT_ID
       ) as LATEST_PURCHASE_DATETIME
  from PRODUCT product
;

-- front as alphabet order
create view NESTED_SUMMARY_PRODUCT as
select product.PRODUCT_ID
     , product.PRODUCT_NAME
     , product.PRODUCT_STATUS_CODE
     , LATEST_PURCHASE_DATETIME
  from SUMMARY_PRODUCT product
;

-- rear as alphabet order
create view WRAPPED_SUMMARY_PRODUCT as
select product.PRODUCT_ID
     , product.PRODUCT_NAME
     , product.PRODUCT_STATUS_CODE
     , LATEST_PURCHASE_DATETIME
  from SUMMARY_PRODUCT product
;
