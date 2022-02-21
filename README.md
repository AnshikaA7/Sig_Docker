# SIG_DOCKER
 this is small rest assured tesng test project with a dockerfile

to run this you only need Docker installed on the system.

In order to build the image run :

docker build -t sig_docker2:latest .

You can check the images :
docker images

And to run the container:
 docker run -it --name samplecontainer sig_docker2:latest /bin/bash
 
 Now to execute the test:
 mvn test
 
 Expected Result: 1 test passed
