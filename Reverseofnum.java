//to reverse a given number.
import java.util.Scanner;
public class Reverseofnum {
 public static void main(String[] args)    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();//1234
    int rev = 0;//0
    while (num != 0) {//1234!=0,123!=0,12!=0,1!=0,0!=0
        int digit = num % 10;//4,3,2,1
        rev = rev * 10 + digit;//0*10+4=4,4*10+3=43,43*10+2=432,432*10+1=4321
        num /= 10;
    }
    System.out.println("Reversed Number: " + rev);
      sc.close();

 } 

}