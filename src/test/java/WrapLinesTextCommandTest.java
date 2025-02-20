import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrapLinesTextCommandTest {
    @Test
    public void testExecute() {
        WrapLinesTextCommand command = new WrapLinesTextCommand("<", ">");
        String result = command.execute("Line 1\nLine 2\nLine 3");
        System.out.println("testExecute: " + result);
        assertEquals("<Line 1>\n<Line 2>\n<Line 3>", result);
    }
}
