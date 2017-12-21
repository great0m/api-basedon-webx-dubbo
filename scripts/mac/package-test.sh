#!/bin/bash

## TITLE:        API和SVC的一键打包脚本
## ENV:          TEST
## AUTHOR:       m
## LOG FORMAT:   日志格式：已 [BUILDER] 开头
## DATE:         2017-12-21

## PARAMS: may be changed according to local env.

CLIENT_VERSION=1.0-SNAPSHOT
BIZ_VERSION=1.0-SNAPSHOT

JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home

SCRIPT_HOME=`pwd`
cd ${SCRIPT_HOME}/../../
GREATM_HOME=`pwd`

COMMON_HOME=${GREATM_HOME}/greatm-common
CLIENT_HOME=${GREATM_HOME}/greatm-client
BIZ_HOME=${GREATM_HOME}/greatm-biz
API_HOME=${GREATM_HOME}/greatm-api
SVC_HOME=${GREATM_HOME}/greatm-service

COMMON_NAME=greatm-common-${CLIENT_VERSION}.jar
CLIENT_NAME=greatm-client-${CLIENT_VERSION}.jar
BIZ_NAME=greatm-biz-${BIZ_VERSION}.jar


## SCRIPT START

cd ${GREATM_HOME}
mvn clean
if [[ $? -eq 0 ]];then echo "[BUILDER] SUCCESS, CONTINUE..."; else exit;fi

echo "[BUILDER] START TO BUILD CLIENT..."
cd ${CLIENT_HOME}
mvn -Dmaven.test.skip=true clean install
if [[ $? -eq 0 ]];then echo ""; else exit;fi

cd ${CLIENT_HOME}/target
mvn install:install-file -Dfile=${CLIENT_NAME} -DgroupId=com.greatm -DartifactId=greatm-client -Dversion=${CLIENT_VERSION} -Dpackaging=jar -DgeneratePom=true -DcreateChecksum=true
if [[ $? -eq 0 ]];then echo "[BUILDER] FINISH CLIENT BUILDING!"; else exit;fi


echo "[BUILDER] START TO BUILD BIZ..."
cd ${BIZ_HOME}
mvn -Dmaven.test.skip=true clean install
if [[ $? -eq 0 ]];then echo ""; else exit;fi

cd ${BIZ_HOME}/target
mvn install:install-file -Dfile=${BIZ_NAME} -DgroupId=com.greatm -DartifactId=greatm-biz -Dversion=${BIZ_VERSION} -Dpackaging=jar -DgeneratePom=true -DcreateChecksum=true
if [[ $? -eq 0 ]];then echo "[BUILDER] FINISH BIZ BUILDING!"; else exit;fi


echo "[BUILDER] START TO PACKAGE SERVICE..."
cd ${SVC_HOME}
mvn -Dmaven.test.skip=true -Dautoconfig.userProperties=config-test.properties -DcustName=ROOT  clean package
if [[ $? -eq 0 ]];then echo "[BUILDER] FINISH TO PACKAGE SERVICE!"; else exit;fi


echo "[BUILDER] START TO PACKAGE API..."
cd ${API_HOME}
mvn -Dmaven.test.skip=true -Dautoconfig.userProperties=config-test.properties -DcustName=ROOT  clean package
if [[ $? -eq 0 ]];then echo "[BUILDER] FINISH TO PACKAGE API!"; else exit;fi

echo "[BUILDER] ALL DONE!"
## SCRIPT END