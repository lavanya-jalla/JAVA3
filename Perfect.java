import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("the number is a perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
        sc.close();


    }
    
}

