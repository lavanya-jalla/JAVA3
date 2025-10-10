
// User Story: As a user, I want to input a positive integer. The program should then calculate two
// sums: the sum of digits at even positions (from the right, starting at position 1) and the sum of
// digits at odd positions. Finally, it should print both sums.
import java.util.Scanner;
public class PositionSum {
    int n,digit,pos=1;
    int oddsum=0,evensum=0;
    public void cal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit:");
        n=sc.nextInt();
        while(n>0){
            digit=n%10;
            if(pos%2==1){
                oddsum+=digit;

            }
            else{
                evensum+=digit;
            }
            n=n/10;
            pos++;

        }
        sc.close();
        System.out.println("Odd Postions sum is :"+oddsum);
        System.out.println("Even Postions sum is :"+evensum);
    }
    
}
class Test{
    public static void main(String[] args) {
        PositionSum obj=new PositionSum();
        obj.cal();
    }
}