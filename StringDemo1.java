
import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 =new String("Lavanya is good girl");
        System.out.println(s1.length());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any char");
        String n=sc.next();
        char c=n.charAt(0);
        System.out.println(c);
        System.out.println(s1.substring(0));
        System.out.println(s1.substring(9,14));
    }
    
}
