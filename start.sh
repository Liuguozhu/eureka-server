#!/bin/sh
#nohup java -server -Xms64m -Xmx512m  -jar eureka-server.jar &
echo "nohup java -jar -Djava.security.egd=file:/dev/./urandom eureka-server.jar &"
. /etc/profile
nohup java -jar -Djava.security.egd=file:/dev/./urandom eureka-server.jar --spring.profiles.active=prod > log.file 2>&1 &
