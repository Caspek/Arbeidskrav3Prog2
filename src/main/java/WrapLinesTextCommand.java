public class WrapLinesTextCommand extends WrapTextCommand {
    public WrapLinesTextCommand(String opening, String closing) {
        super(opening, closing);
    }

    public String execute(String text) {
        if (text == null) {
            return null;
        }
        String[] lines = text.split("\n");
        StringBuilder wrappedText = new StringBuilder();
        for (String line : lines) {
            wrappedText.append(getOpening()).append(line).append(getClosing()).append("\n");
        }
        return wrappedText.toString().trim();
    }
}
