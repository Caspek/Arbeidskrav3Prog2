import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplaceTextCommandTest {
    @Test
    void testExecute() {
        ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
        String result = command.execute("Text with target and target");
        System.out.println("testExecute: " + result);
        assertEquals("Text with replacement and replacement", result);
    }

    @Test
    void testExecuteWithNoMatch() {
        ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
        String result = command.execute("Text with no match");
        System.out.println("testExecuteWithNoMatch: " + result);
        assertEquals("Text with no match", result);
    }

    @Test
    void testGetTarget() {
        ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
        String target = command.getTarget();
        System.out.println("testGetTarget: " + target);
        assertEquals("target", target);
    }

    @Test
    void testGetReplacement() {
        ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
        String replacement = command.getReplacement();
        System.out.println("testGetReplacement: " + replacement);
        assertEquals("replacement", replacement);
    }

}
