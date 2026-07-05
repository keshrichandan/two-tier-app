# Use a lightweight JDK base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built jar file (adjust name if different)
COPY target/two-tier-app-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app runs on
EXPOSE 8081

# Run the jar
ENTRYPOINT ["java","-jar","app.jar"]