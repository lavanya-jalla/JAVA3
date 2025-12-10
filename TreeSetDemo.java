import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Emp> t1=new TreeSet(new NameComp());
    Emp e1=new Emp(121, "Lavanya", 20000);
    Emp e2=new Emp(122, "Kushala", 3000);
    Emp e3=new Emp(123, "Kumari", 4000);
    Emp e4=new Emp(124, "Rakesh", 50000);
    t1.add(e1);
    t1.add(e2);
    t1.add(e3);
    t1.add(e4);
    t1.add(new Emp(124, "Swathi", 10000));
    
    TreeSet<Emp> t2=new TreeSet(new SalaryComp());
     t2.add(e1);
    t2.add(e2);
    t2.add(e3);
    t2.add(e4);
    t2.add(new Emp(124, "Swathi", 10000));
    System.out.println("Names with ASCENDING ORDER: ");
    Iterator<Emp> i1=t1.iterator();
    while (i1.hasNext()) {
        Object elem =  i1.next();
        System.out.println(elem);
        
    }
    System.out.println("Salaries with DESCENDING ORDER: ");
    Iterator<Emp> i2=t2.iterator();
    while (i2.hasNext()) {
        Object elem =  i2.next();
        System.out.println(elem);
        
    }

    }
    
}
class NameComp implements Comparator<Emp>{
    @Override
    public int compare(Emp e1,Emp e2){
        return e1.getEmpName().compareTo(e2.getEmpName());

    }
}
class SalaryComp implements Comparator<Emp>{
    @Override
    public int compare(Emp e1,Emp e2){
        if(e1.getEmpSal()>e2.getEmpSal()){
            return 1;
        }
        else{
            return -1;
        }
    }
}


