FROM openjdk:latest

COPY /src/util /var/www/java
WORKDIR /var/www/java

EXPOSE 8080

RUN javac Server.java
CMD ["java", "Server"]
