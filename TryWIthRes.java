import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWIthRes {
     public static void main(String[] args) throws Exception{
       
         try ( BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
                System.out.println("Enter Your Name and Age: ");
                
                String name=br.readLine();
                int age =Integer.parseInt(br.readLine());
                System.out.println(name +" " + age);
                // we write exception try catch also uese throws exception
            } 
            
        System.out.println("WE have lot more code to be executed ....");

    }
    

    
}
