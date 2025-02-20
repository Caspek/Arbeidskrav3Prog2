import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeWordsTextCommandTest {
    @Test
    public void testExecute() {
        CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
        String result = command.execute("text to capitalize");
        System.out.println("testExecute: " + result);
        assertEquals("Text To Capitalize", result);
    }
}
