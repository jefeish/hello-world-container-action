FROM eclipse-temurin:17-jdk
COPY . /HelloAction.java
RUN javac /HelloAction.java
ENTRYPOINT ["java", "-cp", "/", "HelloAction"]
