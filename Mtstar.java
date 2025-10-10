
    
import java.util.Scanner;
public class Mtstar { 
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
}
}

class Star{
    public static void main(String[] args) {
    Mtstar obj=new Mtstar();
    obj.Cal();
}
}

