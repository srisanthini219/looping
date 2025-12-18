// to find the LCM of two numbers.
import java.util.Scanner;
public class Lcm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int lcm = findLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        scanner.close();
    }
    public static int findLCM(int a, int b) {
        int max = Math.max(a, b);
        int lcm = max;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm += max;
        }
        return lcm;
    }
}
