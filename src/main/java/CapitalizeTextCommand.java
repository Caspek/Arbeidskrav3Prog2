public class CapitalizeTextCommand extends TextCommand {

    public String execute(String text) {
        if (text == null) {
            return null;
        }
        return text.toUpperCase();
    }

}
