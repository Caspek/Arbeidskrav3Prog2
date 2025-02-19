import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrapTextCommandTest {
    @Test
    public void testExecute() {
        WrapTextCommand command = new WrapTextCommand("<", ">");
        String result = command.execute("Text to wrap");
        System.out.println("testExecute: " + result);
        assertEquals("<Text to wrap>", result);
    }

}
