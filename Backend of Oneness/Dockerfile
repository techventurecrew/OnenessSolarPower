# Stage 1: Build the application
FROM openjdk:17-slim AS builder

# Install Maven
RUN apt-get update && apt-get install -y maven

# Copy the rest of the application code
COPY . .

# Package the application, skipping tests
RUN mvn clean package -DskipTests

# Stage 2: Create a smaller runtime image
FROM openjdk:17-slim

# Copy the built JAR file from the builder stage
COPY --from=builder /target/Solar-Power-0.0.1-SNAPSHOT.jar Solar-Power.jar

# Expose port 8080 (default for Spring Boot applications)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "Solar-Power.jar"]
