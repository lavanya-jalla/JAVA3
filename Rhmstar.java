
    
import java.util.Scanner;
public class Rhmstar {

    public void Cal(){
         int n;
        
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       for(int i=1;i<=n;i++){
       
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){

            
             System.out.print("* ");
            }
        
        System.out.println();
       
    }

for(int i=n-1;i>=1;i--){
       
            for(int j=n-i;j>=1;j--){
                
             System.out.print(" ");
                

            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            
            }
        
        System.out.println();
       
    }
}
}

class Star{
    public static void main(String[] args) {
    Rhmstar obj=new Rhmstar();
    obj.Cal();
}
}
    

