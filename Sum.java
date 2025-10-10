// // User Story: As a user, I want to input two integers, and then the program should calculate the
// sum of all even numbers between (and including) the two given numbers if the first number is
// smaller than the second. If the second number is smaller, it should calculate the sum of all odd
// numbers between (and including) the two given numbers. If the numbers are equal, it should
// output "Numbers are equal."

import java.util.Scanner;
public class Sum {
    int a,b,sum=0;

    public void cal(){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number: ");
        a=sc.nextInt();
         System.out.println("Enter second number: ");
        b=sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }

    
    else if(a<b){
        while(a<=b){
            if(a%2==0){
                sum+=a;
            }
            a++;
        }
        System.out.println("Sum of even numbers = " + sum);
    }
        else{
            while(a>=b){
                if(a%2==1)
                {
                    sum+=a;
                }
                a--;
            }
            System.out.println("Sum of odd numbers = " + sum);


        } 
        sc.close();  
    } 

}

   class Perform{
   

   public static void main(String[] args) {
   
      Sum obj=new Sum();
      obj.cal();
   }
}

