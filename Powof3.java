//Q21. Write a Java program to check whether a given integer is a power of 3 or not.
import java.util.Scanner;
public class Powof3 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println(num + " is NOT a Power of 3");
        } else {
            while (num % 3 == 0) {
                num /= 3;
            }
            if (num == 1) {
                System.out.println("The number is a Power of 3");
            } else {
                System.out.println("The number is NOT a Power of 3");
            }
        }
        sc.close();
    }
}   