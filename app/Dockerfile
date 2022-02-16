FROM openjdk:11
EXPOSE 8080
ADD app/target/diplomovka-app-docker*.jar diplomovka-app-docker.jar
ENTRYPOINT ["java", "-jar", "diplomovka-app-docker.jar"]