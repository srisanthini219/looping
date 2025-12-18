import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
        int n=sc.nextInt();
        int sumodd=0;
        int sumeven=0;
        for(int i=1;i<=n;i++){
            if(i%n==0){
                sumodd+=i;
                System.out.println(sumodd +" ");
            } else{
                sumeven +=i;
                System.out.println(sumeven +" ");
            }
        }
        
    }
}