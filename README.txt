
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The example project for PostgreSQL and DBFlute.


# ========================================================================================
#                                                                              Environment
#                                                                              ===========
[Maven2]
This project needs maven2 for compile.

[PostgreSQL]
1. Prepare PostgreSQL
Download and Install 

2. Create user and database and schema

CREATE USER maihamadb PASSWORD 'maihamadb';
CREATE DATABASE maihamadb WITH ENCODING='UTF8' OWNER=maihamadb;
\connect maihamadb;
CREATE SCHEMA nextschema AUTHORIZATION maihamadb;

3. Execute ReplaceSchema task

  3-1. execute dbflute_maihamadb/nextschema-renewal.sh|bat
  3-2. execute dbflute_maihamadb/manage.sh|bat selecting replace-schema(0)
