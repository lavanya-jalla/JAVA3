
import java.util.Scanner;

public class Operator{
    int v1,v2;
    public void performCal(){
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter the first value");
            v1=sc.nextInt();
            System.out.println("Enter the second value");
            v2=sc.nextInt();
             
        
        if(v1>0&&v2>0){
            System.out.println(v1/v2);

        }
        else{
            System.out.println("enter value should be greater than Zero");
        }
    }
}
        class Test{
           public static void main(String[] args) {
            Operator obj =new Operator();
            obj.performCal();
               
           } 
        }
    
