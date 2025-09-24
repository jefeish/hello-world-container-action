# hello-world-container-HelloAction
This project is a sample of GitHub Actions using Java, supporting both container-based and composite action approaches. 

It includes:

- A **container action** that runs Java code inside a Docker image, ideal for encapsulating dependencies and environment.
- A **composite action** that compiles and executes Java code directly on the runner, showcasing flexible automation without Docker.

- Sample **workflows** for testing the actions:
  - `.github/workflows/test-composite-action.yml`
  - `.github/workflows/test-container-action.yml`

---

## Local Build and Test

To test and run the *'action-code'* itself, use the following instructions

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
