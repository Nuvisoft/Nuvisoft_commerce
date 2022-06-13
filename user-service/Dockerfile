FROM openjdk:11

WORKDIR /app/

COPY ./target/users-service.jar ./app/App.jar

ENTRYPOINT [ "java", "-jar", "/app/App.jar" ]