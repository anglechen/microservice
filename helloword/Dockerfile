FROM java:8-jre
MAINTAINER aubrey

ADD ./target/helloword-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/helloword-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080