import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Marks of 5 subjects of a student");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        if((m1<36 ||m2<36 ||m3<36 ||m4<36 ||m5<36)){
            System.out.println("Student is Failed");
            return;
            
        }
        if((m1>100||m2>100 || m3>100|| m4>100 ||m5>100)){
            System.out.println("Enter the valid marks outoff 100");
            return;
        }
        
        
        float avg=((m1+m2+m3+m4+m5)/500.0f)*100;
        System.out.println("The Average of the student: "+avg);
       
        


    }
    
}
