
import java.util.Scanner;

// Write a Java program to find the sum of digits of a number using a while loop.
public class SumOfDigits {
    int n,sum=0;
    
    public void Cal(){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0){
            int temp=n%10;
            sum=sum+temp;
            n=n/10;


        }
        System.out.println("Sum of the digits"+sum);
        sc.close();
    }
    
}
class Test{
    public static void main(String[] args) {
        SumOfDigits obj=new SumOfDigits();
        obj.Cal();
    }
}