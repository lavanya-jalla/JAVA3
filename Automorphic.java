
import java.util.Scanner;

public class Automorphic {
    public void Cal(){
        int n,temp,rev=0,rem=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n*n;
        System.out.println("The square of the number: "+temp);
        
        while(n>0){
            if(n%10!=temp%10)
            {
                System.out.println(" not an Automorphic number");
                return;
            }
        
            n=n/10;
            temp=temp/10;
        }
        
            System.out.println("automorphic number");
          
        }
    
    
}


class Test{
    public static void main(String[] args) {
        Automorphic obj=new Automorphic();
        obj.Cal();
    }
}