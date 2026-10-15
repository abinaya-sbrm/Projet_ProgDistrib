# Étape 1 : compilation avec Gradle + JDK 21
FROM gradle:8.13-jdk21 AS builder
WORKDIR /home/gradle/project
COPY build.gradle settings.gradle ./
RUN gradle dependencies --no-daemon
COPY src ./src
RUN gradle bootJar -x test --no-daemon

# Étape 2 : image d'exécution légère
FROM eclipse-temurin:21-jre-jammy
RUN addgroup --system spring && adduser --system spring --ingroup spring
WORKDIR /app
COPY --from=builder /home/gradle/project/build/libs/*.jar app.jar
USER spring:spring
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
