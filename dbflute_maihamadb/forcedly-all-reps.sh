#!/bin/bash

cd `dirname $0`

export answer=y

sh nextschema-renewal.sh
sh manage.sh replace-schema
