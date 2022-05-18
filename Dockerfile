FROM openjdk:8-jdk-alpine
LABEL maintainer="Yarynych Vitalii"
ARG JAR_FILE=target/sms.jar
COPY ${JAR_FILE} yarynych.jar
ENTRYPOINT ["java","-jar","/yarynych.jar"]