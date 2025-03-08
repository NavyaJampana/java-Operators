package Operator;
public class IncrementDecrement {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("Original Number: " + num);
        System.out.println("Post-Increment: " + (num++));
        System.out.println("After Post-Increment: " + num);
        System.out.println("Pre-Increment: " + (++num));
        System.out.println("Post-Decrement: " + (num--));
        System.out.println("After Post-Decrement: " + num);
        System.out.println("Pre-Decrement: " + (--num));
    }
}
