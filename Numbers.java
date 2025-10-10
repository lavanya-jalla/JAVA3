import java.util.Scanner;

public class Numbers {
    int n,column;
    public void cal(){
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        column=sc.nextInt();
        for(int i=1;i<=n;i++){

        System.out.print(i+"\t");
        if(i%column==0){
            System.out.println();
        }

               
            }sc.close();

        }
    }   
    

class Test{
    public static void main(String[] args) {
        
    
    Numbers obj = new Numbers();
    obj.cal();
}
}