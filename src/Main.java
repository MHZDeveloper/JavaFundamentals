import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // byte[] myNumbers = new byte[5];
        byte[] myNumbers = {6, 8, 7, 4, 1};
        System.out.println("first element = " + myNumbers[0]);
        myNumbers[0] = 2;
        System.out.println("length = " + myNumbers.length);
        System.out.println("myNumbers = " + Arrays.toString(myNumbers));
        Arrays.sort(myNumbers);
        System.out.println("myNumbers = " + Arrays.toString(myNumbers));
    }
}
