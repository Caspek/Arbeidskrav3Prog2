public class CapitalizeSelectionTextCommand extends TextCommand {
    private String selection;

    public CapitalizeSelectionTextCommand(String selection) {
        this.selection = selection;
    }

    public String execute(String text) {
        if (text == null) {
            return null;
        }
        return text.replace(selection, selection.toUpperCase());
    }

    public String getSelection() {
        return selection;
    }
}
