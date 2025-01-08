FROM openjdk:17
WORKDIR /appContainer
COPY ./target/jenkinsCiCd.jar /appContainer
# this will copy the docket.jar file from container an dkeep it under appContainer folder in container
EXPOSE 8383
#in docker on what port u need to run the docker image
CMD ["java", "-jar", "jenkinsCiCd.jar"]