FROM openjdk:11

WORKDIR /usr/app/

COPY /target/credits-service.jar ./App.jar
#credits-service/target/credits-service.jar
ENTRYPOINT [ "java",  "-jar", "App.jar"]