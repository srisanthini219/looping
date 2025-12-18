//Q16. Write a Java program to check whether a given number is a Neon Number or not.
import java.util.Scanner;
public class Neonnum {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num;
        int sumOfDigits = 0;

        while (square != 0) {
            int digit = square % 10;
            sumOfDigits += digit;
            square /= 10;
        }

        if (sumOfDigits == num) {
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is NOT a Neon Number");
        }
        sc.close();
    }
}