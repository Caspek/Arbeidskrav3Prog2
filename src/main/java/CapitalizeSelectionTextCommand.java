public class CapitalizeSelectionTextCommand extends TextCommand {
    private String selection;

    public CapitalizeSelectionTextCommand(String selection) {
        this.selection = selection;
    }

    public String execute(String text) {
        if (text == null) {
            return null;
        }
        String capitalizedSelection = selection.substring(0, 1).toUpperCase() + selection.substring(1);
        return text.replace(selection, capitalizedSelection);
    }

    public String getSelection() {
        return selection;
    }
}