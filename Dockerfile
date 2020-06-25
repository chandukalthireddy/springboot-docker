FROM openjdk:8

ADD target/springboot-docker-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081:8080

ENTRYPOINT ["java", "-jar", "app.jar"]
