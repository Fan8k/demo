FROM hub.c.163.com/library/java:latest
VOLUME /tmp
ADD target/demo.jar docker.jar
ENTRYPOINT ["java","-jar","/docker.jar"]