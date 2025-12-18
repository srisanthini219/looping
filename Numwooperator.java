//Q22. Write a Java program to multiply two numbers without using * operator.
import java.util.Scanner;
public class Numwooperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = 0;
        for (int i = 0; i < Math.abs(num2); i++) {
            result += num1;
        }

        // Adjust sign if num2 is negative
        if (num2 < 0) {
            result = -result;
        }

        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + result);
        sc.close();
    }
}