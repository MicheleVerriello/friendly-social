# Java 17 image
FROM openjdk:17-jdk

WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/friend-events-apis-0.0.1-SNAPSHOT.war /app/app.war

# Expose the port on which the Spring Boot application will run
EXPOSE 8081

# Set the command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "app.war", "--server.port=8081"]