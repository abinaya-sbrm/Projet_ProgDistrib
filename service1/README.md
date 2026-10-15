# service1

Microservice Spring Boot (Java 21, Gradle).

## Lancer en local
```bash
./gradlew bootRun
curl http://localhost:8080/hello
```

## Image Docker
```bash
docker build -t <pseudo-dockerhub>/service1:latest .
docker run -p 8080:8080 <pseudo-dockerhub>/service1:latest
docker push <pseudo-dockerhub>/service1:latest
```
