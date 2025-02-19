import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CapitalizeTextCommandTest {
    @Test
    public void testExecute() {
        CapitalizeTextCommand command = new CapitalizeTextCommand();
        String result = command.execute("text to capitalize");
        System.out.println("testExecute: " + result);
        assertEquals("Text to capitalize", result);
    }
}
