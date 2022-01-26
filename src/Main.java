public class Main {

    public static void main(String[] args) {
        String ch = "Hello World !";

        System.out.println("ends with '!' : " + ch.endsWith("!"));
        System.out.println("starts with 'h' : " + ch.startsWith("h"));
        System.out.println("length : " + ch.length());
        System.out.println("index of 'o' : " + ch.indexOf("o"));
        System.out.println("replace every 'o' with 'a' : " + ch.replace("o","a"));
        System.out.println("to lowercase : " + ch.toLowerCase());
        System.out.println("to uppercase : " + ch.toUpperCase());
        ch = "    Hello World !    ";
        System.out.println("trim : " + ch.trim());
    }
}
