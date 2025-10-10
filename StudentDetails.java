import java.util.Scanner;

public class StudentDetails {
    private int  age=19;
    private String name="Lavanya";
    float CGPA=9.2f;
    private String branch="CSE";
    protected String password="lavanya@123";
    String email="lavanya123jalla@gmail.com";
    public void getCGPA(){
        Scanner sc=new Scanner(System.in);
        String email,password;
        System.out.println("Enter your email Id:");
        email=sc.next();
        System.out.println("Enter your email password:");
        password=sc.next();
        if(this.email.equalsIgnoreCase(email)&&this.password.equals(password)){
            System.out.println("Your CGPA is:"+CGPA);
            if(CGPA>=5.5){
                System.out.println("You are promotted to Final year");
            }
            else{
                System.out.println("You are not promotted");
            }
        }
        else{
            System.out.println("Invalid credentials.Please try again");
        }
    }

public static void main(String[] args) {
    StudentDetails d =new StudentDetails();
    d.getCGPA();
}
   
    
}
