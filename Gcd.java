//to find the GJavaD of two numbers.
import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();//5
        int num2 = sc.nextInt();//6
        
        while (num2 != 0) {//6!=0
            int temp = num2;//temp=6
            num2 = num1 % num2;//num2=5%6=5
            num1 = temp;//num1=6
        }
        
        System.out.println("GCD: " + num1);
        sc.close();
    }
}
