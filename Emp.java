public class Emp {
    private int  eid;
    private String ename;
    private double  esalary;
    public Emp(int eid,String ename,double esalary){
        this.eid=eid;
        this.ename=ename;
        this.esalary=esalary;
    }
    public String toString(){
        return eid + " " +ename+ " " + " "+esalary;
    }
    public String getEmpName(){
        return ename;
    }
    public double getEmpSal(){
        return esalary;
    }
    
}
