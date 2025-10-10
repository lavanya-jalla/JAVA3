// User Story: As a user, I want to input a positive integer. The program should then continuously
// sum the digits of the number until the result is a single-digit number. Finally, it should print this
// single-digit sum.

import java.util.Scanner;

public class DigitSum{
    int a,sum,sum1;
    
    public void cal(){
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        a = sc.nextInt();
        while(a>=10){
            sum1=0;
            while(a>0){

            sum=a%10;
            a=a/10;
            sum1=sum1+sum;

        }
        a = sum1;  
    }  
        System.out.println("Single Digit Sum is: "+a);
        sc.close();
    }
    
}
class Dispaly{
    public static void main(String[] args) {
        DigitSum obj = new DigitSum();
        obj.cal();
        
    }
}