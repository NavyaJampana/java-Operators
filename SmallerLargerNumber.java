package Operator;
import java.util.Scanner;

public class SmallerLargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Larger Number: " + num1);
            System.out.println("Smaller Number: " + num2);
        } else if (num1 < num2) {
            System.out.println("Larger Number: " + num2);
            System.out.println("Smaller Number: " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}

