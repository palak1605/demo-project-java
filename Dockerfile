FROM openjdk:17
WORKDIR /app
COPY target/*.jar docker-file.jar
ENTRYPOINT ["java", "-jar", "docker-file.jar"]
