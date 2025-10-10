
import java.util.Scanner;

public class SameInVo {
    String a;
    String b;
    public void Cal(){
        Scanner sc=new Scanner(System.in);
        a=sc.next();
        b=sc.next();
        String arr[]={"a","e","i","o","u"};
        int minLength = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < minLength; i++) {
            String ch1 = String.valueOf(Character.toLowerCase(a.charAt(i)));
            String ch2 = String.valueOf(Character.toLowerCase(b.charAt(i)));
           
           
           
            {
                System.out.println("Magical names with name index postions of vowel"+a.charAt(i));
                boolean true;
            }
            if(!mag){
                System.out.println("not a magical string");
            }
        }
    }
}
}
class Test{
    public static void main(String[] args) {
        SameInVo obj=new SameInVo();
        obj.Cal();
    }
}

        
        
    

