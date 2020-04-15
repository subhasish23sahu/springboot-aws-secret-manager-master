FROM openjdk:latest
COPY target/*.jar springboot_awssecretmanager_docker.jar
ENTRYPOINT  ["java","-jar","/springboot_awssecretmanager_docker.jar"]
EXPOSE 8080