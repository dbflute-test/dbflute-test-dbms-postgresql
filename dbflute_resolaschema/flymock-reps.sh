#!/bin/bash

cd `dirname $0`
. _project.sh


echo "...Synchronizing DDL with maihamadb client."
cp ../dbflute_maihamadb/playsql/resolasql/*.sql ./playsql/flymock_resolasql/

echo "/nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
echo "Specify the environment type to use resolaschema."
echo "nnnnnnnnnn/"
export DBFLUTE_ENVIRONMENT_TYPE=flymock_resola

export answer=y
sh manage.sh 0

if [ $taskReturnCode -ne 0 ];then
  exit $taskReturnCode;
fi


echo "...Synchronizing DDL with maihamadb client."
cp ../dbflute_maihamadb/playsql/nextsql/*.sql ./playsql/flymock_nextsql/

echo "/nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
echo "Specify the environment type to use nextschema."
echo "nnnnnnnnnn/"
export DBFLUTE_ENVIRONMENT_TYPE=flymock_next

export answer=y
sh manage.sh 0

if [ $taskReturnCode -ne 0 ];then
  exit $taskReturnCode;
fi



echo "/nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
echo "Remove the environment type (closing)."
echo "nnnnnnnnnn/"
unset DBFLUTE_ENVIRONMENT_TYPE
