# hello-world-container-HelloAction

## Local Build and Test

### Gradle

> **Best Practice:** Commit the Gradle wrapper files (`gradlew`, `gradlew.bat`, and the `gradle/wrapper` directory) to your repository. This ensures all users build with a consistent Gradle version and do not need Gradle pre-installed.

```sh
./gradlew build
./gradlew test
java -cp build/classes/java/main HelloAction
```

---

### Maven

```sh
mvn clean install
mvn test
java -cp target/classes HelloAction
```
