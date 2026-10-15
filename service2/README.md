# service2

Microservice Spring Boot (Java 21, Gradle).

## Lancer en local
```bash
./gradlew bootRun
curl http://localhost:8081/hello
```

## Image Docker
```bash
docker build -t <pseudo-dockerhub>/service2:latest .
docker run -p 8081:8081 <pseudo-dockerhub>/service2:latest
docker push <pseudo-dockerhub>/service2:latest
```
