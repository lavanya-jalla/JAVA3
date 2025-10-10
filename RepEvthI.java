
import java.util.Scanner;

public class RepEvthI {
    public static void main(String[] args) {
        String name;
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        String result=" ";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='e'){
                result+='i';


            }
            else{
                result+=name.charAt(i);
            }

        }
        System.out.println(result);
    }
    
}
