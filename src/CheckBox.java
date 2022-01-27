public class CheckBox extends WebControl {
    private boolean isChecked;

    public CheckBox() {
        this.isChecked = false;
    }

    public CheckBox(boolean isChecked) {
        this.isChecked = isChecked;
    }

    @Override
    public void show() {
        System.out.println("checkbox is shown !");
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
