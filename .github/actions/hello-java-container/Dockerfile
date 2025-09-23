FROM eclipse-temurin:17-jdk
COPY /src/main/java/HelloAction.java /HelloAction.java
RUN javac /HelloAction.java
ENTRYPOINT ["java", "-cp", "/", "HelloAction"]
