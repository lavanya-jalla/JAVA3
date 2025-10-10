
import java.util.Scanner;
public class Invertstar { 
    public void Cal(){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
        //     int j=0;
        //     if(j==1&&j<=n){
        //         System.out.print(" ");
        //         j++;
        //     }
        //     else{
        //         System.out.print("*");
        //         j++;
            
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){

            
             System.out.print("*");
            }
        
        System.out.println();
       
    }
}
}

class Star{
    public static void main(String[] args) {
    Invertstar obj=new Invertstar();
    obj.Cal();
}
}