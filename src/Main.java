public class Main {

    public static void main(String[] args) {
        short myNumber = -2;
        boolean isPositiveAndEven = myNumber > 0 && myNumber % 2 == 0;
        boolean isPositiveOrEven = myNumber > 0 || myNumber % 2 == 0;
        System.out.println("isPositiveAndEven = " + isPositiveAndEven);
        System.out.println("isPositiveOrEven = " + isPositiveOrEven);
    }
}
