FROM eclipse-temurin:17-jre

RUN groupadd spring && useradd -g spring spring
COPY build/libs/tyr-java-service*.jar /app.jar
RUN chown spring:spring /app.jar && chmod 644 /app.jar

USER spring:spring

ENV JAVA_OPTS ""

EXPOSE 8080
EXPOSE 8081

ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar
