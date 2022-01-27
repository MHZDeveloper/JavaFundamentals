public class TextBox {

    private String text;
    private boolean isEnabled = true;

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
