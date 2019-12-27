FROM java:8-alpine

ADD ./center-bootstrap/target/center-bootstrap-1.0.0-SNAPSHOT.jar bootstrap.jar

EXPOSE 8848

ENTRYPOINT ["java", "-Dspring.config.name=application-remote", "-jar", "./bootstrap.jar"]