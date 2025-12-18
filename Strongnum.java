import java.util.Scanner;
public class Strongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n=158
        int sum = 0;//
        int temp = n;//158
        while (n > 0) {//158>0
            int digit = n % 10;//8,5,1
            int factorial = 1;//1
            for (int i = 1; i <= digit; i++) {//i=1 to 8
                factorial *= i;//1*1=1,1*2=2,2*3=6,6*4=24,24*5=120,120*6=720,720*7=5040,5040*8=40320
            }
            sum += factorial;//sum=0+40320=40320+120=40440+1=40441
            n /= 10;//15,1,0
        }
        if (sum == temp) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not Strong number");
        }
        sc.close();
    }
}