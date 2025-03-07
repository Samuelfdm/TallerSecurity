FROM openjdk:21

WORKDIR /usrapp/bin

ENV PORT 5000

COPY target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]