FROM adoptopenjdk/openjdk11:latest
MAINTAINER emirgarip
COPY target/clinked-0.0.1-SNAPSHOT.jar clinked-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/clinked-0.0.1-SNAPSHOT.jar"]