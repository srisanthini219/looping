// to print all factors of a given number
public class Factofnum {
    public static void main(String[] args) {
        int number = 28;
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}