FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY app/target/sgrestaurant.jar restaurant.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "restaurant.jar"]