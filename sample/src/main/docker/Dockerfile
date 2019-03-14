FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD SpringSample-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-Dspring.profiles.active=log-console,log-jdbc,log-file -Djava.security.egd=file:/dev/./urandom ","-jar","/app.jar"]
