FROM maven:3.6-jdk-8-slim
WORKDIR /sig_docker
COPY src /sig_docker/src
COPY testng.xml /sig_docker/testng.xml
COPY pom.xml /sig_docker
