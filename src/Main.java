public class Main {

    public static void main(String[] args) {
        short myNumber = 2;
        boolean isEven = myNumber % 2 == 0;
        System.out.println("even : " + isEven);
        boolean isOdd = myNumber % 2 != 0;
        System.out.println("odd : " + isOdd);
        boolean isPositive = myNumber > 0;
        System.out.println("positive : " + isPositive);
        boolean isZero = myNumber == 0;
        System.out.println("is not zero : " + isZero);
    }
}
