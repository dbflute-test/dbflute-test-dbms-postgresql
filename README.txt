
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


# ========================================================================================
#                                                                      PostgreSQL on MacOS
#                                                                      ===================
[official site]
https://hub.docker.com/_/postgres/

[first time]
docker pull postgres

[run]
docker run --name postflute -p 5432:5432 -e POSTGRES_PASSWORD=postpass -d postgres
docker run -it --rm --link postflute:postgres postgres psql -h postgres -U postgres

(begin batch)
CREATE USER maihamadb PASSWORD 'maihamadb';
CREATE DATABASE maihamadb WITH ENCODING='UTF8' OWNER=maihamadb;
\connect maihamadb;
CREATE SCHEMA nextschema AUTHORIZATION maihamadb;
(end batch)

[remove]
docker stop postflute
docker rm postflute
