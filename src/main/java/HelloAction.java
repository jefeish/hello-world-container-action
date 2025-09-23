import java.nio.file.*;

public class HelloAction {
    public static void main(String[] args) throws Exception {
        String name = System.getenv("INPUT_NAME");
        if (name == null || name.isBlank()) {
            name = "World";
        }

        // Print to logs
        System.out.println("Hello, " + name + "!");

        // Set an output (must write to GITHUB_OUTPUT)
        String githubOutput = System.getenv("GITHUB_OUTPUT");
        if (githubOutput != null && !githubOutput.isBlank()) {
            String output = "greeting=Hello, " + name + "!";
            Files.writeString(
                Path.of(githubOutput),
                output + System.lineSeparator(),
                java.nio.file.StandardOpenOption.CREATE,
                java.nio.file.StandardOpenOption.APPEND
            );
        }
    }
}
