FROM openjdk:8-jdk-alpine

MAINTAINER dvnguyen
RUN mkdir /home/code
WORKDIR /home/code

COPY demo-0.0.1-SNAPSHOT.war /home/code

ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.war"]
