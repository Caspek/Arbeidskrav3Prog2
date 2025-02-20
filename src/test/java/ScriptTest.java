import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScriptTest {
    @Test
    public void testExecute() {
        TextCommand command1 = new CapitalizeTextCommand();
        TextCommand command2 = new WrapSelectionTextCommand("(", ")", "Text");
        TextCommand command3 = new CapitalizeSelectionTextCommand("to");
        TextCommand command4 = new ReplaceTextCommand("capitalize", "read");
        List<TextCommand> commands = Arrays.asList(command1, command2, command3, command4);
        Script script = new Script(commands);

        String result = script.execute("text to capitalize");
        System.out.println("testExecute: " + result);
        assertEquals("(Text) To read", result);
    }
}
