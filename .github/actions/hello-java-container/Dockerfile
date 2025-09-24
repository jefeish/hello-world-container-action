# Use Java JDK base image
FROM eclipse-temurin:17-jdk
COPY $GITHUB_WORKSPACE /workspace
WORKDIR /workspace
RUN javac src/main/java/HelloAction.java
ENTRYPOINT ["bash", "-c", "java -cp src/main/java HelloAction"]
