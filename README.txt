
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The example project for PostgreSQL and DBFlute.


# ========================================================================================
#                                                                              Environment
#                                                                              ===========
[Maven2]
This example uses Maven2 so prepare your maven2 environment. (For example, Q4E)


[PostgreSQL]
1. Prepare PostgreSQL
Download and Install 

2. Create role and database and schema

  2-1. execute following DDLs

CREATE ROLE maihamadb LOGIN
  ENCRYPTED PASSWORD 'md51208ea48dfff137b9d19a73ead386a5c'
  NOSUPERUSER INHERIT NOCREATEDB NOCREATEROLE NOREPLICATION VALID UNTIL '1970-01-01 00:00:00';
COMMENT ON ROLE maihamadb IS 'for DBFlute';

CREATE DATABASE maihamadb WITH ENCODING='UTF8' OWNER=maihamadb;

  2-2. create Schema 'nextschema'

3. Execute ReplaceSchema task

  3-1. execute dbflute_maihamadb/replace-schema.sh|bat

