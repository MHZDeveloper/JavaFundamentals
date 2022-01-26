import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // byte[][] myNumbers = new byte[2][2];
        byte[][] myNumbers = {{4, 1}, {5, 2}};
        System.out.println("first element = " + myNumbers[0][0]);
        myNumbers[0][0] = 3;
        System.out.println("length = " + myNumbers.length);
        System.out.println("myNumbers = " + Arrays.deepToString(myNumbers));
    }
}
