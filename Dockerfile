FROM hub.c.163.com/library/java:latest
VOLUME /tmp
ADD target/springboot-docker-0.0.1-SNAPSHOT.jar docker.jar
RUN bash -c 'touch /docker.jar'
ENTRYPOINT ["java","-jar","/docker.jar"]

#"-Djava.security.egd=file:/dev/./urandom",