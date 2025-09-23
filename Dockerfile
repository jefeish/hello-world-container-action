FROM eclipse-temurin:17-jdk
COPY src/main/java/Action.java /Action.java
RUN javac /Action.java
ENTRYPOINT ["java", "Action"]