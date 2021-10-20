# this is not used yet, but I have to dockerize java app soon

FROM openjdk:11-jdk-alpine

WORKDIR /usr/src/app

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

COPY build/libs/*.jar ./build/application.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "./build/application.jar"]