//Q20. Write a Java program to check whether a given number is a Magic Number or not.
import java.util.Scanner;
public class Magicnum {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 9) {
            sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            num = sum;
        }

        if (num == 1) {
            System.out.println("The number is a Magic Number");
        } else {
            System.out.println("The number is NOT a Magic Number");
        }
        sc.close();
    }
}