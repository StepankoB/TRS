FROM openjdk

RUN mkdir /src
WORKDIR /src
COPY /out/artifacts/trs_jar/trs.jar /src
EXPOSE 8080

CMD java -jar trs.jar