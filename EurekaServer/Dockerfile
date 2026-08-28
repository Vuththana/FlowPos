# Stage 1: Build
FROM gradle:jdk21-alpine AS builder

WORKDIR /workspace

COPY gradle .
COPY settings.gradle build.gradle ./
COPY src ./src
RUN gradle bootJar --no-daemon


# Stage 2: Run
FROM eclipse-temurin:21-jdk-alpine
COPY --from=builder /workspace/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]