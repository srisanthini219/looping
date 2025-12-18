//Q23. Write a Java program to find N power of M (Exponentiation) without using built-in functions.
import java.util.Scanner;
public class Exponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number (N): ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent (M): ");
        int exponent = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        sc.close();
    }
}