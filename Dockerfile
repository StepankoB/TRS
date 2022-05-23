FROM openjdk

RUN mkdir /app
WORKDIR /app
COPY /src /app
EXPOSE 8080

RUN javac util.Server.java
CMD ["java", "util.Server"]
