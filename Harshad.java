
import java.util.Scanner;

public class Harshad {
    public void Cal(){
        int n,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int sum=0;
        temp=n;
      
        while(n>0){
            temp=n%10;
            n=n/10;
            sum=sum+temp;
        }
        if(n%sum==0){
            System.out.println("The number is a hashard number");
        }
        else{
            System.out.println("Not a hasshard number");
        }
    }
    
}
class Test{
    public static void main(String[] args) {
        Harshad obj=new Harshad();
        obj.Cal();
    }
}
