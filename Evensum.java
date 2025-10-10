
import java.util.Scanner;


public class Evensum {
    int n,sum;
    public void cal(){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        for(int i=0;i<=n;i++){
            
                if(i%2==0){
                    sum+=i;
                    

            }
            }
            sc.close();
            System.out.println("the even numbers sum"+sum);

        }
    }
    

class Test{
    public static void main(String[] args) {
        Evensum obj=new Evensum();

        obj.cal();
    }
}

