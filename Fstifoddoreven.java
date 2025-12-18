// to find whether the first digit of a given number is odd or even.
import java.util.Scanner;
public class Fstifoddoreven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n >= 10) {
            n = n / 10;
        }
        if (n % 2 == 0) {
            System.out.println("First digit is even");
        } else {
            System.out.println("First digit is odd");
        }
        sc.close();
    }
}