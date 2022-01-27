public class TextBox {

    private String text;
    private boolean isEnabled = true;

    public TextBox() {
    }

    public TextBox(String text) {
        this.text = text;
    }

    public TextBox(String text, boolean isEnabled) {
        this.text = text;
        this.isEnabled = isEnabled;
    }

    void setText(String text) {
        if (isEnabled)
            this.text = text;
    }

    void enable() {
        this.isEnabled = true;
    }

    void disable() {
        this.isEnabled = false;
    }

    public String getText() {
        return text;
    }
}
