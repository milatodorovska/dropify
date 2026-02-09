# 1️⃣ Build stage
FROM maven:3.9.3-eclipse-temurin-17 AS build
WORKDIR /app

# Копирај само pom.xml прво (за кеширање)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Копирај целиот код
COPY src ./src

# Build JAR
RUN mvn clean package -DskipTests -B


# 2️⃣ Runtime stage
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Копирај JAR од build stage
COPY --from=build /app/target/dropify-0.0.1-SNAPSHOT.jar dropify.jar

EXPOSE 8080
CMD ["java", "-jar", "dropify.jar"]
