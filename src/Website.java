public class Website {

    private Renderer webRenderer;

    public Website(Renderer webRenderer) {
        this.webRenderer = webRenderer;
    }

    void print(){
        webRenderer.render();
    }
}
