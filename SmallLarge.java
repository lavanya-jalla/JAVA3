
// User Story: As a user, I want to input a positive integer. The program should find and print the
// smallest and largest digits present in that number.
import java.util.Scanner;
public class SmallLarge {
    int n,digit;
    int smallest=9,largest=0;
    public void cal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        n=sc.nextInt();
        if(n==0){
            smallest=largest;
        }
        else{

        
        while(n>0){
            digit=n%10;
            if(digit<smallest){
                smallest=digit;
            }
            else{
                largest=digit;
            }
            n=n/10;
        }
        sc.close();
        System.out.println("Smallest digit = " + smallest);
        System.out.println("Largest digit = " + largest);

    }
}
    
}
class Test{
    public static void main(String[] args) {
        SmallLarge obj=new SmallLarge();
        obj.cal();
    }
}