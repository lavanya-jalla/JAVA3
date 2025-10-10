
import java.util.Scanner;

public class Neon {
    public void Cal(){
        int n,temp,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n*n;
        System.out.println("Square of the number"+temp);
        int x=temp;
        while(x>0){
            
             int y=x%10;
             sum=sum+y;
             x=x/10;
        }
        if(sum==n){
            System.out.println("It is a Neon number");
            return;
        }
        else{
            System.out.println("Not a Neon number");
            return;
        }
    }
    
}
class Test{
    public static void main(String[] args) {
        
    
    Neon obj=new Neon();
    obj.Cal();
}
}
