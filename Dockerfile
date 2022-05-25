FROM openjdk:latest

COPY src /src
#WORKDIR /src

EXPOSE 8090

RUN javac src/util/Server.java
CMD java -classpath src util.Server
