public class Main {

    public static void main(String[] args) {
        Website website1 = new Website(new MobileRenderer());
        website1.print();

        Website website2 = new Website(new WebRenderer());
        website2.print();
    }
}
