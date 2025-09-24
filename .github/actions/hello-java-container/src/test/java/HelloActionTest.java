import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloActionTest {
    @Test
    public void testMainOutput() throws Exception {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        java.io.PrintStream originalOut = System.out;
        System.setOut(new java.io.PrintStream(outContent));
        try {
            HelloAction.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }
        String output = outContent.toString().trim();
        assertEquals("Hello, World!", output);
    }
}
