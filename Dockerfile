# ================================
# STAGE 1: Build Application
# ================================
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

# Copy pom.xml dulu supaya dependency bisa di-cache
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build jar
RUN mvn clean package -Dmaven.test.skip=true

# ================================
# STAGE 2: Runtime
# ================================
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

RUN apk add --no-cache wget

# Copy hasil build dari stage sebelumnya
COPY --from=build /app/target/*.jar app.jar

# Default command
ENTRYPOINT ["java", "-jar", "app.jar"]
