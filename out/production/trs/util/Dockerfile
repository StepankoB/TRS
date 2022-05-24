FROM openjdk:latest

COPY . /var/www/java
WORKDIR /var/www/java

EXPOSE 8080

RUN javac Server.java
CMD ["java", "Server.main()"]
