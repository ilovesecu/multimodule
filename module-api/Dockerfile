FROM openjdk:17-jdk-slim
EXPOSE 9876
ENV USE_PROFILE prod
ENV TZ Asia/Seoul
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]