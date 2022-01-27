public class Main {

    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double
        byte x = 3;
        int y =x;
        x=(byte)y;

        float a = 1.2F;
        double b = a;
        a = (float)b;
    }
}
