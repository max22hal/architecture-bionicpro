# Используем официальный образ с Java 17 и Maven
FROM maven:3.9.3-eclipse-temurin-17 AS build
WORKDIR /build
COPY . .
RUN mvn clean package -DskipTests

# Используем минимальный JDK образ для запуска
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /build/target/bionic-api-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
