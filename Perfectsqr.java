// to check whether a given integer is a perfect square or not.
public class Perfectsqr {
    public static void main(String[] args) {
        int number = 36;
        boolean isPerfectSquare = false;

        for (int i = 1; i <= number / 2; i++) {//1 to 18
            if (i * i == number) {//6*6=36
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}