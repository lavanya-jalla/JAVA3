import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List stdList=new ArrayList();
        stdList.add(new Student(123, "Lavanya", 9.0, "VCE", "KMM"));
        stdList.add(new Student(124, "kushala", 8.0, "VCE", "KMM"));
        stdList.add(new Student(125, "kumari", 8.0, "VCE", "KMM"));
        stdList.add(new Student(126, "swathi", 7.0, "VCE", "KMM"));
        System.out.println(stdList);

    }
    
}
