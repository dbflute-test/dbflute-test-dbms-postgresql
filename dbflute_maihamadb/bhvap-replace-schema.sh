#!/bin/bash

. _project.sh

# #for_now needs ApplicationBehavior test project but already unused function? by jflute (2022/05/15)
echo *ApplicationBehavior environment is not complete so cannot execute it
exit 0;

echo "/nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
echo "Specify the environment type to use bhvap."
echo "nnnnnnnnnn/"
export DBFLUTE_ENVIRONMENT_TYPE=bhvap

echo "/nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
echo "Specify the file path to be used as build-properties."
echo "nnnnnnnnnn/"
export MY_PROPERTIES_PATH=build-${MY_PROJECT_NAME}.properties

echo "/nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"
echo "Execute {Replace-Schema}."
echo "nnnnnnnnnn/"
sh $DBFLUTE_HOME/etc/cmd/_df-replace-schema.sh $MY_PROPERTIES_PATH


