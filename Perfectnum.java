import java.util.Scanner;
public class Perfectnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//8
        int sum=0;
        for(int i=1;i<n;i++){//1 2 3 4 5 6 7
            if(n%i==0){//8%1==0,8%2==0,8%3!=0,8%4==0,8%5!=0,8%6!=0,8%7!=0
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("Perfect num");
        }else{
            System.out.println("Not Perfect num");
        }sc.close();
    }
    
}
