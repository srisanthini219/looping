public class Prodofdigits {
    public static void main(String[] args) {
            int number = 1234;
            int prod = 1;
            while (number != 0) {
                prod =prod* number % 10;
                number /= 10;
            }
            System.out.println("Product of digits: " + prod);
        }  
}
