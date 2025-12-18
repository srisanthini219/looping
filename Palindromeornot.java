//Q6. Write a Java program to check whether a number is palindrome or not.

import java.util.Scanner;
public class Palindromeornot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome Number");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome Number");
        }
        sc.close();
    }
}