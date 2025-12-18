import java.util.Scanner;
public class Twisted_Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
            int rev=0;
            int p=0;
            int p1=0;
            while(num!=0){
                int digit=num%10;
                rev=rev*10+digit;
                num=num/10;
            }
            System.out.println(rev);
            int count=0;
            for(int i=1;i<=num;i++){
                if(num%1==0){
                    count++;
                }if(count==2){
                    System.out.println("prime");
                    p+=1;
                }
                else{
                    System.out.println("not prime");  }

                    for(int j=1;j<=rev;j++){
                        if(rev%1==0){
                            count++;
                        }if(count==2){
                            System.out.println("  prime");
                            p1+=1;
                        }
                        else{
                            System.out.println("not  prime");
                        }

                       // if(num==rev){
                       //     System.out.println("Twisted prime");
                       // }
                      //  else{
                         //   System.out.println("not a twisted prime");
                      //  }
                       sc.close();
            }
        
        }
     if(p==p1){
                            System.out.println("Twisted prime");
                        }
                        else{
                            System.out.println("not a twisted prime");
                        }
}}