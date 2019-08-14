ps -ef | grep eureka-server.jar | grep -v grep | cut -c 9-15 | xargs kill -s 9
