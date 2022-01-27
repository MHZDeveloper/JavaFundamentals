public class Main {

    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double
        byte x = 3;
        int y =x;
        x=(byte)y;

        float a = 1.2F;
        double b = a;
        a = (float)b;

        // cast from string
        String ch1 = "7";
        int myNumber1 = Integer.parseInt(ch1);
        System.out.println(myNumber1);

        String ch2 = "7.4";
        float myNumber2 = Float.parseFloat(ch2);
        System.out.println(myNumber2);
    }
}
