#!/usr/bin/env bash
mvn clean install -Dmaven.test.skip=true

scp -r target/Serena-0.0.1-SNAPSHOT.jar senior@inti.init.uji.es:~/serena/server/serena.jar
