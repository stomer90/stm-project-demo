FROM openjdk:8-jdk-alpine

MAINTAINER Phong Nguyen

VOLUME /tmp

# Add Spring Boot app.jar to Container
ADD ./target/stm-eureka-server-0.0.1-SNAPSHOT.jar app.jar

RUN sh -c 'touch /app.jar'

EXPOSE 8761

ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]


