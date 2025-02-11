import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ReplaceTextCommandTest {
    @Test
    void testExecute() {
        ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
        String result = command.execute("Text with target and target");
        assertEquals("Text with replacement and replacement", result);
    }

}
