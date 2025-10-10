
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,fac=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the the number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        System.out.println("The factorial of the given number"+fac);
        sc.close();
    }
    
}
