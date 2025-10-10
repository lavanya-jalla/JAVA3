
// User Story: As a user, I want to input a positive integer. The program should reverse the digits of
// the number and then determine if the original number is a palindrome (reads the same forwards
// and backward). It should print both the reversed number and whether the original number is a
// palindrome.
import java.util.Scanner;
public class Palindrome {
    int n,rev=0,rem;
    public void cal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
         int original = n; 
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        sc.close();

    System.out.println("Reversed number = " + rev);
    if(original==rev){
        System.out.println("Is Palindrome:True");
    }
    else{
        System.out.println("Is Palindrome:False");
    }
    
}
}
class Test{
    public static void main(String[] args){
    Palindrome obj=new Palindrome();
    obj.cal();
}
}
