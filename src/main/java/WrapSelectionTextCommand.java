public class WrapSelectionTextCommand extends WrapTextCommand {
    private String selection;
    public WrapSelectionTextCommand(String opening, String closing, String selection) {
        super(opening, closing);
    }

    public String execute(String text) {
        if (text == null) {
            return null;
        }
        return text.replace(selection, getOpening() + selection + getClosing());
    }

    public String getSelection() {
        return selection;
    }
}
