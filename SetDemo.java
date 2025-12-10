import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        
    
    //Hash set and linked hash set
    //hash sett -random order ignores dublicates
    Set s=new HashSet();
    s.add(2);
    s.add("Lavanya");
    s.add(18);
    s.add("Kumari");
    s.add(false);
    s.add(null);
    System.out.println(s);
    Iterator itr=s.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
        System.out.println("********************");
    }
    //linkedhashset igonres duplicates ,insertion order
       Set s1=new LinkedHashSet();
       s1.add(20);
    s1.add("Lavanya");
    s1.add(180);
    s1.add("Kumari");
    s1.add("Kushala");
    s1.add(false);
    s1.add(null);
    s1.add(20);
    System.out.println(s1);
    Iterator it=s1.iterator();
    while (it.hasNext()) {
       System.out.println(it.next()); 
        
    }
    //tree set=same datatype to compare,igonores duplicates,ascending order
    Set<String> t=new TreeSet(new MyComp());
    t.add("Lavanya");
    t.add("Kushala");
    t.add("Kumari");
    t.add("Swathi");
    t.add("Prasad");
    t.add("Rakesh");
    t.add("Lavanya");
    System.out.println(t); 
    Iterator i=t.iterator();
    while (i.hasNext()) {
        Object elem =  i.next();
        System.out.println(elem);
        
    }
    
    //by default hashset give us ascending order if we want descending order then.. we go for compare methode and overide
}
}
class MyComp implements Comparator<String>{
    @Override
    public int compare(String s1,String s2){
        return s2.compareTo(s1);
    }
}
