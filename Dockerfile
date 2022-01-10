#FROM openjdk:8-jdk-alpine
FROM maven:3.8.4-jdk-11
VOLUME /tmp
COPY src /usr/src/app/src  
COPY pom.xml /usr/src/app 
RUN mvn -f /usr/src/app/pom.xml clean package
ADD target/*.jar helloworld.jar
#ENV JAVA_OPTS="
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /helloworld.jar" ]
