#Around 5 MB
FROM eclipse-temurin:17
RUN mkdir /opt/app
#Layer App Jar
COPY build/libs/jibdemo-0.0.1-SNAPSHOT.jar /opt/app/jibdemo.jar
CMD ["java", "-jar", "/opt/app/jibdemo.jar"]