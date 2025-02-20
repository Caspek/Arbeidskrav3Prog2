import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeSelectionTextCommandTest {
    @Test
    public void testExecute() {
        CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("to");
        String result = command.execute("Text to capitalize");
        System.out.println("testExecute: " + result);
        assertEquals("Text To capitalize", result);
    }
}
