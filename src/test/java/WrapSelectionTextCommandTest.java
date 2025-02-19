import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrapSelectionTextCommandTest {
    @Test
    public void testExecute() {
        WrapSelectionTextCommand command = new WrapSelectionTextCommand("<", ">", "to" );
        String result = command.execute("Text to wrap");
        System.out.println("testExecute: " + result);
        assertEquals("Text <to> wrap", result);
    }
}
