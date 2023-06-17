FROM openjdk:20-jdk-slim
WORKDIR /app
COPY ./target/projetim-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "projetim-0.0.1-SNAPSHOT.jar"]