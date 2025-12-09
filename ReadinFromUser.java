
import java.io.*;
import java.util.Scanner;
public class ReadinFromUser {
    public static void main(String[] args) throws Exception {
        //command line
        // System.out.println("Hello world" +args[0]);

        // scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name and age");
        String name=sc.next();
        int age=sc.nextInt();
        System.out.println("Name: "+name+ "Age: "+age);

        //buffer reader
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name and age");
        String n=b.readLine();
        int a=Integer.parseInt(b.readLine());
        System.out.println("Name: "+n+ "Age: "+a);

        //console class it doesnt throws io exception
        Console c=System.console();
        System.out.println("Enter your name and age");
         String d=c.readLine();
        int e=Integer.parseInt(c.readLine());
        System.out.println("Name: "+d+ "Age: "+e);
        
        //read passwords
        char pwd[]=c.readPassword();
        System.out.println("Enter your Password");
        System.out.println(pwd);
        






       



    }
    
}
