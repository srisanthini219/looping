//Q18. Write a Java program to check whether a given number is a Buzz Number or not.
import java.util.Scanner;
public class Buzznumber {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println(num + " is a Buzz Number");
        } else {
            System.out.println(num + " is NOT a Buzz Number");
        }
        sc.close();
    }
}