# FROM maven:3.8.4-openjdk-11-slim as build

# WORKDIR /app/

# COPY pom.xml ./
# COPY mvnw.* ./
# COPY .mvn/ ./

# RUN mvn clean

# COPY ./src ./

# RUN mvn package spring-boot:repackage 

FROM openjdk:11

WORKDIR /usr/app/

# COPY --from=build /app/target ./
# target/eureka-service-discovery.jar 
COPY /target/eureka-service-discovery.jar ./App.jar

ENTRYPOINT [ "java",  "-jar", "App.jar"]

