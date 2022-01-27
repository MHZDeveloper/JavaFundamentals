public class Main {

    public static void main(String[] args) {
        short myNumber = -2;
        String msg = "";
        if (myNumber > 0) {
            msg = "Positive";
        } else if (myNumber < 0) {
            msg = "Negative";
        } else {
            msg = "Zero";
        }
        System.out.println(msg);
        msg = myNumber % 2 == 0 ? "Even" : "Odd";
        System.out.println(msg);
    }
}
