import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceFirstTextCommandTest {
    @Test
    public void testExecute() {
        ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("target", "replacement");
        String result = command.execute("Text with target and target");
        System.out.println("testExecute: " + result);
        assertEquals("Text with replacement and target", result);
    }

    @Test
    public void testExecuteWithNoMatch() {
        ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("target", "replacement");
        String result = command.execute("Text with no match");
        System.out.println("testExecuteWithNoMatch: " + result);
        assertEquals("Text with no match", result);
    }
}
