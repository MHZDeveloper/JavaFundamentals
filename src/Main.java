import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //primitive type
        byte myNumber = 5;
        System.out.println(myNumber);

        // reference type
        Point a = new Point(1, 1);
        System.out.println(a);

        // *** primitive vs reference
        System.out.println("- primitive vs reference");
        // primitive
        byte x = 1;
        byte y = x;
        x = 3;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // reference
        Point p1 = new Point(1, 1);
        Point p2 = p1;
        p1.y = 2;
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
    }
}
