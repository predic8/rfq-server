FROM docker.io/eclipse-temurin:17-jre-alpine

#RUN mkdir /app
#
#RUN addgroup -g 1001 -S appuser
#RUN adduser -u 1001 -S appuser -G appuser
#RUN chown -R appuser:appuser /app
#
#WORKDIR /app
#
#USER 1001
#
#COPY target/*.jar app.jar
#
#EXPOSE 8080
#
#ENTRYPOINT ["java","-jar","app.jar"]
