
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name and Age: ");
            try {
                
                String name=br.readLine();
                int age =Integer.parseInt(br.readLine());
                System.out.println(name +" " + age);
                // we write exception try catch also uese throws exception
            } catch (Exception e) {
                System.err.println(e);
            }   
            finally{
                if(br!=null){
                    br.close();
                    System.out.println("Resuorces Closed");
                }
            } 
        System.out.println("WE have lot more code to be executed ....");

    }
    
}
