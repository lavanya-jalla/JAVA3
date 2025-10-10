
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int i,x,count=0;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        sc.close();
        for(i=2;i<=x;i++){
            if(x%i==0)
            {
                count++;
            }
        }
            if(count==1){
                System.out.println("Prime number");
            }
            else{
                System.out.println("not a prime number");
            }
        }
    }
    

