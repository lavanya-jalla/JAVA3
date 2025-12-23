import java.util.Scanner;

public class StudentGradeDisplay{
    int roll_no;
    String name;
    int marks[];

    public StudentGradeDisplay(int roll_no,String name,int marks[]){
        this.roll_no=roll_no;
        this.name=name;
        this.marks=marks;

    }
    public double CalculateAverage(){
        double sum=0;
        for(int m:marks){
            sum+=m;
        }
        return sum/5.0;


    }
    public char CalculateGrade(double avg){
        if(avg>=90){
            return 'A';
        }
        else if(avg>=75){
            return 'B';

        }
        else if(avg>=60){
            return 'D';
        }
        else{
            return 'D';
        }

    }
    public void displayDetails(){
        double avg=CalculateAverage();
        System.out.println("Name: "+name);
        System.out.println("Roll_no: "+roll_no);
        System.out.println("Average: "+avg);
        System.out.println("Grade: "+CalculateGrade(avg));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int roll_no=sc.nextInt();
        String name=sc.next();
        int marks[]=new int[5];
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        StudentGradeDisplay s=new StudentGradeDisplay(roll_no, name, marks);
        s.displayDetails();

    }


    
}
