import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List stdList=new ArrayList();
        stdList.add(new Student(123, "Lavanya", 9.0, "VCE", "KMM"));
        stdList.add(new Student(124, "kushala", 8.0, "VCE", "KMM"));
        stdList.add(new Student(125, "kumari", 8.0, "VCE", "KMM"));
        stdList.add(new Student(126, "swathi", 7.0, "VCE", "KMM"));
        System.out.println(stdList);
        Iterator itr=stdList.iterator();
        while (itr.hasNext()) {
        //    System.out.println(itr.next());
           Student s1=(Student) itr.next();
           System.out.println( s1.id+ " "+s1.uni);
            
        }

    }
    
}
