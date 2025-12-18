//to print the spynum between 100 to 1000
import java.util.Scanner;
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=100;i<=n;i++){
        int sum=0;
        int pro=1;
        int temp=i;
        while(temp>=100){
            int rem=temp%10;
            sum=sum+rem;
            pro=pro*rem;
            temp=temp/10;

        }
        if(pro==sum){
            System.out.println(i);
        }
    }sc.close();

}