
import java.util.Scanner;

public  class Exception1 {
    String var=null;
    public String  DisplayStringValue(){
        int index;
        
        Scanner sc=new Scanner(System.in);
        var=sc.nextLine();
        int x=(var.length())/2;
        String s1=var.substring(0,x);
        char ch=s1.charAt(0);
        int count=0;
        
        for(int i=0;i<s1.length();i++)
        {
            if(ch==s1.charAt(i))
            {
                count++;
            }
        }
        int y=x*count;
        try {
            
            System.out.println(var.charAt(y));
        } catch (Exception e) {
        }
        
   return  var;
    }

    public static void main(String[] args) {
        Exception1 obj=new Exception1();
        obj.DisplayStringValue();

    }


}
