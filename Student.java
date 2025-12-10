public class Student {
     int id;
    private String name;
    private double gpa;
     String uni;
    private String city;
    public Student(int id,String name,double gpa,String uni,String city){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
        this.uni=uni;
        this.city=city;
    }
    @Override
    public String toString(){
        return " ID: " +id+
                "\tName: " +name+
                "\tGPA: " +gpa+
                "\tUNIVERSITY: " +uni+
                "\tCITY: " + city + "\n";

    }
    
}
