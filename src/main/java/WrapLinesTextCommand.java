public class WrapLinesTextCommand extends WrapTextCommand {
    public WrapLinesTextCommand(String opening, String closing) {
        super(opening, closing);
    }

    public String execute(String text) {
        if (text == null) {
            return null;
        }
        return getOpening() + text + getClosing();
    }
}
