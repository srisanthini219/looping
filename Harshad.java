import java.util.Scanner;
public class Harshad {
 public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();//18
int temp=n;//18
int sum=0;
while(temp>0){
    sum=sum+(temp%10);//sum=0+8=8,
    temp=temp/10;

}
if(n%sum==0){
    System.out.println("it is an harshad num");
}else{
    System.out.println("it is not an harshad num");
}
sc.close();
 }    
}
