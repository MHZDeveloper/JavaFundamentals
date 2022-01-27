public abstract class WebControl {
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

    public abstract void show();
}
