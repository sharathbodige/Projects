FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
WORKDIR /app/app
RUN mvn clean package -DskipTests	

FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY --from=build /app/app/target/*.jar restaurant.jar
EXPOSE 8080	
ENTRYPOINT ["java", "-jar", "restaurant.jar"]








# FROM eclipse-temurin:17-jdk-jammy
#WORKDIR /app
#COPY app/target/sgrestaurant.jar restaurant.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "restaurant.jar"]