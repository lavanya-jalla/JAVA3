
import java.util.Scanner;

public class Magical {
    public void Cal(){
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        while(temp>0){
            int y=temp%10;
            sum=sum+y;
            temp=temp/10;

        }
        if(sum==1){
            System.out.println("Magical Number");
        }
        else{
            System.out.println("Not a magical number");
        }
    }

}
class Test{
    public static void main(String[] args) {
        
    
    Magical obj=new Magical();
    obj.Cal();
}
}