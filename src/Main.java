public class Main {

    public static void main(String[] args) {
        // round
        double a1 = Math.round(1.5);
        System.out.println(a1);
        double a2 = Math.round(1.4);
        System.out.println(a2);

        // ceil
        double b = Math.ceil(1.5);
        System.out.println(b);

        // floor
        double c = Math.floor(1.5);
        System.out.println(c);

        // random
        double d = Math.random();
        System.out.println(d);
        System.out.println((int) (d * 100));
    }
}
