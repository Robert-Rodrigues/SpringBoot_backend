FROM openjdk:20.0.1-jdk-slim
WORKDIR /app
COPY ./target/Projetim-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "Projetim-0.0.1-SNAPSHOT.jar"]