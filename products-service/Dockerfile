FROM openjdk:11

WORKDIR /app/

COPY ./target/products-service.jar ./app/App.jar

ENTRYPOINT [ "java", "-jar", "/app/App.jar" ]