public class Main {

    public static void main(String[] args) {

        for (int i=1;i<=100;i++){
            String msg="";
            if (i%3==0)
                msg += "Foo";
            if (i%5==0)
                msg += "Bar";
            if (i%7==0)
                msg += "Qix";

            if (msg.isEmpty())
                System.out.println(i);
            else
                System.out.println(msg);
        }
    }
}
