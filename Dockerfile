FROM openjdk:17
EXPOSE 9090
ADD target/SpringBootApp.jar  SpringBootApp.jar
ENTRYPOINT ["java","-jar", "/SpringBootApp.jar"]