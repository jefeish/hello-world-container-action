import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActionTest {
    @Test
    public void testMainOutput() {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        java.io.PrintStream originalOut = System.out;
        System.setOut(new java.io.PrintStream(outContent));
        try {
            Action.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }
        String output = outContent.toString().trim();
        assertEquals("Hello from Java in a GitHub Action container!", output);
    }
}
