import java.util.Scanner;

public class Numbers1 {
    int n,m;
    public void cal(){
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
        System.out.print(i);
        
        }
        System.out.println();

               
            }sc.close();

        }
    }   
    

class Test{
    public static void main(String[] args) {
        
    
    Numbers obj = new Numbers();
    obj.cal();
}
}