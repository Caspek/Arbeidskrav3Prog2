public class ReplaceFirstTextCommand extends ReplaceTextCommand {

    public ReplaceFirstTextCommand(String target, String replacement) {
        super(target, replacement);
    }

    public String execute(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceFirst(getTarget(), getReplacement());
    }
}
