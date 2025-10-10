
import java.util.Scanner;

public class Kaprekar {
    public void Cal(){
        int x,sum=0,count=0,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        int res=x*x;
        y=x;
        while(x>0){
            x=x/10;
            count++;

        }
        int p=(int)Math.pow(10,count);
        int z=res%p;
        int s=res/p;
        if(z+s==y){
            System.out.println("Karrekar number");
        }
        else{
            System.out.println("not a karprekar number ");
        }

    }
    
}
class Test{
    public static void main(String[] args) {
        Kaprekar obj=new Kaprekar();
        obj.Cal();
    }
}
