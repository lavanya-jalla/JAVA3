
import java.util.Scanner;

public class Repnum {
    public void cal(){
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        
        for(int i=0;i<n;i++){
            if(i%2==0){
            for(int j=0;j<=2;j++){
                for(int k=0;k<=j;k++){

                
                System.out.print(j+" ");
            }
        }
    }

      
        else{

        
            for(int j=2;j>=0;j--){

            
            for(int k=0;k<=j;k++){
                System.out.print(j+" ");
            }
        }
        }
            System.out.println();
        }
    }
}
    

class Test{
    public static void main(String[] args) {
        Repnum obj =new Repnum();
        obj.cal();
    }

}
