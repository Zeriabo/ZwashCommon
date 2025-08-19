# Dockerfile
FROM maven:3.9.9-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

FROM maven:3.9.9-eclipse-temurin-17 AS builder2
WORKDIR /app
COPY --from=builder2 /app/target/*.jar ZwashCommon.jar
RUN mvn clean package -DskipTests
