import java.util.List;

public class Script {
    private List<TextCommand> textCommands;

    public Script(List<TextCommand> textCommands) {
        this.textCommands = textCommands;
    }

    public String execute(String text) {
        for (TextCommand command : textCommands) {
            text = command.execute(text);
        }
        return text;
    }
}
