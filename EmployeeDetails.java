
import java.util.Scanner;

public class EmployeeDetails {
    String email;
    int yoe;
    private double packageL;
    private String des;
    String Cn;
    Scanner sc=new Scanner(System.in);
    public void EntryEmpDetails(){
        System.out.println("Enter Email");
        email=sc.nextLine();
        System.out.println("Enter years of experience");
        yoe=sc.nextInt();
        System.out.println("Enter package");
        packageL=sc.nextInt();
        System.out.println("Enter the Designation");
        des=sc.nextLine();
        System.out.println("Enter the Candidate name");
        Cn=sc.nextLine();
    }
    public float WorkingHrs(float value,float hrs){
        // Float hrs;
        if(hrs>2050){
            System.out.println("You will get full package "+packageL);
        }
        else if(hrs>1250){
            System.out.println("You will get package of 50% "+ packageL/2);

        }
        else{
            System.out.println("You are Terminated");
        }
        return (float(packageL))
        hrs=value*hrs;

    }
    public void Admin(){
        
        EntryEmpDetails();
    }
    public Employee extends EmployeeDetails{
        public String LoginProcess(){
            Private int eid;
            Scanner sc=new Scanner(System.in);
            eid=sc.nextLine();
            if(eid>0){
                System.out.println("msd=Sucesss");
            }
            else{
                System.out.println();
            }

           



        }


    }
    class Test{
        public static void main(String[] args) {
            obj employee=new employee();
            obj.
        }
    }

        
    }

    
}
