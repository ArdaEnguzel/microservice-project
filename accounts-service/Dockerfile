#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

#info for who maintains the image
MAINTAINER ardaenguzel

#Add application jar to the iamage
COPY target/accounts-service-0.0.1-SNAPSHOT.jar accounts-service-0.0.1-SNAPSHOT.jar
#Execute the application
ENTRYPOINT ["java","-jar","accounts-service-0.0.1-SNAPSHOT.jar"]