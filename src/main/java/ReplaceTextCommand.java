public class ReplaceTextCommand extends TextCommand {
    private String target;
    private String replacement;

    public ReplaceTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }

    public String execute (String text) {
        if (text == null) {
            return null;
        }
      return text.replace(target, replacement);
    }

    public String getTarget() {
        return target;
    }

    public String getReplacement() {
        return replacement;
    }

}
