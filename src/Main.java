public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        int x1 = 1;
        int y1 = ++x1;
        System.out.println("x1 = "+x1);
        System.out.println("y1 = "+y1);

        int x2 = 1;
        int y2 = x2++;
        System.out.println("x2 = "+x2);
        System.out.println("y2 = "+y2);

        int number = 5;
        number+=3; // number = number + 3
        number-=3; // number = number - 3
        number*=3; // number = number * 3
        number/=3; // number = number / 3
        number%=3; // number = number % 3
    }
}
