FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
WORKDIR /app
COPY --from=builder /app/target/*jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]