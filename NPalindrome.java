
import java.util.Scanner;

public class NPalindrome {
    int n,rev=0,rem;
    public void cal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a digit");
        n=sc.nextInt();
        int original=n;
        while(n>0){
            
            
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
            
            
        }
        sc.close();
        if(original==rev){

            System.out.println("It is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
class Test{
    public static void main(String[] args) {
        
    
    NPalindrome obj=new NPalindrome();
    obj.cal();

    }
}