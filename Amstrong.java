
import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        int temp,sum=0,x,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your digit");
        x=sc.nextInt();
        // sc.close();
       
        int num=x;
        while(num>0){
            num=num/10;
            count++;
        }
        num=x;
        while(num>0){
            temp=num%10;
            sum=sum+(int)Math.pow(temp,count);
            num=num/10;
           


        }
        if(x==sum){
            System.out.println("It is a amstrong");
        }
        else{
            System.out.println("Not a amstrong");
        }
        sc.close();
    }
}
    

