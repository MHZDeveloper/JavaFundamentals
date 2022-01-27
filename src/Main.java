public class Main {

    public static void main(String[] args) {
        TextBox textBox = new TextBox("Hello World !");
        CheckBox checkBox = new CheckBox();
        checkBox.disable();
        System.out.println("checkbox " + checkBox.isEnabled());
        System.out.println("number of text boxes = " + TextBox.counter);
    }
}
