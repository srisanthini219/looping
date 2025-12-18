// to print the first digit of a given number.
import java.util.Scanner;
public class FstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n >= 10) {
            n = n / 10;
        }
        System.out.println("First digit: " + n);
        sc.close();
    }
}