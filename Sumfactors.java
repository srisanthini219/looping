//Q12. Write a Java program to find the sum of all factors of a given number.
import java.util.Scanner;
public class Sumfactors {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of all factors of " + num + " is: " + sum);
        sc.close();
    }
}