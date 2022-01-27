import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int myNumber = scanner.nextInt();

        if (myNumber%3==0)
            System.out.println("FIZZ");
        else if (myNumber%5==0)
            System.out.println("BUZZ");
        else
            System.out.println(myNumber);
    }
}
