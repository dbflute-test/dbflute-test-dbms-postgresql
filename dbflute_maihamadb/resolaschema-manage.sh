#!/bin/bash

cd `dirname $0`
. _project.sh

echo "/nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
echo "Specify the environment type to use nextschema."
echo "nnnnnnnnnn/"
export DBFLUTE_ENVIRONMENT_TYPE=resolaschema

FIRST_ARG=$1
SECOND_ARG=$2

sh $DBFLUTE_HOME/etc/cmd/_df-manage.sh $MY_PROPERTIES_PATH $FIRST_ARG $SECOND_ARG
taskReturnCode=$?

if [ $taskReturnCode -ne 0 ];then
  exit $taskReturnCode;
fi
