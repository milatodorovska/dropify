# Build
FROM maven:3.9.3-eclipse-temurin-17 AS build
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn clean package -DskipTests -B

# Run
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

COPY --from=build /app/target/dropify-0.0.1-SNAPSHOT.jar dropify.jar

EXPOSE 8080
CMD ["java", "-jar", "dropify.jar"]
