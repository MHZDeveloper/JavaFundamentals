public class TextBox {

    private String text;
    private boolean isEnabled = true;

    public static int counter;

    public TextBox() {
        counter++;
    }

    public TextBox(String text) {
        this.text = text;
        counter++;
    }

    public TextBox(String text, boolean isEnabled) {
        this.text = text;
        this.isEnabled = isEnabled;
        counter++;
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
