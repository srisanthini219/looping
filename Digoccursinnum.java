//to check whether the given digit is occurred in a number.
import java.util.Scanner;
public class Digoccursinnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//1023,156,18
        int digit = sc.nextInt();//2
        boolean found = false;//because initially we have not found the digit
        while (n > 0) {//1023>0
            int currentDigit = n % 10;//3,2,0,1
            if (currentDigit == digit) {//2==2
                found = true;//we have found the digit
                break;//exit from the loop
            }
            n = n / 10;//102
        }
        if (found) {
            System.out.println("Digit occurs in the number");
        } else {
            System.out.println("Digit does not occur in the number");
        }
        sc.close();
    }
}
//explanation:
//1. We read the number 'n' and the 'digit' to be searched from the user.
//2. We initialize a boolean variable 'found' to false, indicating that we have not found the digit yet.
//3. We use a while loop to iterate through each digit of the number 'n'
//   by repeatedly extracting the last digit using 'n % 10' and then removing it using 'n / 10'.
//4. Inside the loop, we check if the current digit matches the 'digit' we