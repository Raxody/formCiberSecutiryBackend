FROM openjdk:17-jdk-slim

WORKDIR /app

COPY ./target/cibersecurity-0.0.1-SNAPSHOT.jar /app/cibersecurity.jar

ENTRYPOINT ["java","-jar","/app/cibersecurity.jar"]