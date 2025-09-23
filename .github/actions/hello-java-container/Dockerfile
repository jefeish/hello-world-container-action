FROM eclipse-temurin:17-jdk
COPY src/main/java/HelloAction.java /HelloAction.java
RUN javac /Action.java
ENTRYPOINT ["java", "-cp", "/", "HelloAction"]