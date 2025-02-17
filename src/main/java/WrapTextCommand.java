public class WrapTextCommand extends TextCommand {
    private String opening;
    private String closing;

    public WrapTextCommand(String opening, String closing) {
        this.opening = opening;
        this.closing = closing;
    }

    public String execute(String text) {
        if (text == null) {
            return null;
        }
        return opening + text + closing;
    }

    public String getOpening() {
        return opening;
    }

    public String getClosing() {
        return closing;
    }
}
