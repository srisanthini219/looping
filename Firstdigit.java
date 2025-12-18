public class Firstdigit {
    public static void main(String[] args) {
        int number = 12345;
        
        // Convert to string and get first character
        String numStr = String.valueOf(Math.abs(number));
        int firstDigit = Integer.parseInt(numStr.substring(0, 1));
        
        System.out.println("First digit: " + firstDigit);
    }
}