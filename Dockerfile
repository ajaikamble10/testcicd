FROM openjdk:17
EXPOSE 2024
ADD target/springboot-image-test.jar springboot-image-test.jar
ENTRYPOINT [ "java","-jar","/springboot-image-test.jar" ]