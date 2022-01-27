import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("gimme a string");
        String ch = scanner.nextLine();
        System.out.println("your input was " + ch);

        System.out.println("gimme an int");
        int num = scanner.nextInt();
        System.out.println("your input was " + num);

    }
}
