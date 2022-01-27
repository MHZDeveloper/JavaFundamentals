public class TextBox extends WebControl {

    private String text;

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

    @Override
    public void show() {
        System.out.println("text box is shown !");
    }

    void setText(String text) {
        if (isEnabled)
            this.text = text;
    }

    public String getText() {
        return text;
    }
}
