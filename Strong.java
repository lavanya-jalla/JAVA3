
import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        while(n>0){
            int digit =n%10;
            int fac=1;


        
        for(int i=1;i<=digit;i++){
            fac=fac*i;
        }
            sum+=fac;
            n=n/10;

        }
       
        
    
    if(original==sum){
        System.out.println("it is a strong number");
    }
    else{
        System.out.println("not a strong number");
    }
    sc.close();
    
}
}
