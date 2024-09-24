# First stage: Build the application using Maven
FROM maven:3.9.8-amazoncorretto-17-al2023 AS build
WORKDIR /app

# Copy pom.xml and source code to the container
COPY pom.xml ./
COPY src ./src

# Build the project with Maven
RUN mvn clean package -DskipTests

# Second stage: Run the application
FROM openjdk:17-slim-bullseye
WORKDIR /app

# Copy the JAR file from the first stage
COPY --from=build /app/target/deployment-project-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Corrected entrypoint
ENTRYPOINT ["java", "-jar", "app.jar"]
