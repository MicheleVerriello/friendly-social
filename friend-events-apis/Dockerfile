FROM openjdk:17 as builder

WORKDIR /app

# Copy the Maven POM and the project source files
COPY pom.xml .
COPY src/ ./src/
COPY mvnw .
COPY .mvn/ ./.mvn/

# Build the project and skip running tests
RUN ["./mvnw", "clean", "install", "-DskipTests"]

# Create a new stage for the final image
FROM openjdk:17

# Set the working directory inside the final container
WORKDIR /app

# Copy the JAR file from the builder stage to the final stage
COPY --from=builder /app/target/friend-events-apis-0.0.1.jar .

# Expose the port the application will listen on
EXPOSE 8080

# Define the entry point for the container to run the JAR file
ENTRYPOINT ["java", "-jar", "friend-events-apis-0.0.1.jar"]