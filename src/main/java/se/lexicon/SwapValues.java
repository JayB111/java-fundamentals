package se.lexicon;

public class SwapValues {

    public static void main(String[] args) {
        int a = 15;
        int b = 42;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}