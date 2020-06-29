#FROM openjdk:8-jdk-alpine
#MAINTAINER Espoir
#VOLUME /tmp
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/onlinekvshop.jar"]

#FROM maven:3.6.0-jdk-8-alpine AS MAVEN_BUILD
#MAINTAINER Espoir d
#COPY pom.xml /build/
#COPY src /build/src/
#WORKDIR /build/
#RUN mvn package
#FROM openjdk:8-jre-alpine
#WORKDIR /app
#COPY --from=MAVEN_BUILD /build/target/docker-boot-intro-0.1.0.jar /app/
#ENTRYPOINT ["java", "-jar", "docker-boot-intro-0.1.0.jar"]

FROM openjdk:8
ADD target/onlinekvshop-0.0.1-SNAPSHOT.jar onlineKV
EXPOSE 8085
ENTRYPOINT ["java", "-jar","onlineKV"]