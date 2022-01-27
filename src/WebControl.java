public class WebControl {
    protected boolean isEnabled = true;

    void enable() {
        this.isEnabled = true;
    }

    void disable() {
        this.isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void show() {
        System.out.println("web control is shown !");
    }
}
