
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=0, b=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        try { 
        a=sc.nextInt();
        b=sc.nextInt();
            int res=a/b;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
           e.printStackTrace();
        //    System.err.println(e);
        }
        catch(InputMismatchException e){
            System.err.println(e);
        }
        // catch(Exception e){
        //     System.err.println(e);
        // } parent class when we dont the exact error then we use it
        finally{
            if(sc!=null){
                sc.close();
                System.out.println("Resources Closed...");
            }
        }
        int sum=a+b;
        System.out.println("Sum: " +sum);
        int product=a*b;
        System.out.println("Product: " + product);
        System.out.println("More code to execute...........");

    }
    
}
