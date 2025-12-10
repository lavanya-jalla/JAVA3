import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> ll=new LinkedList();
        ll.add("Khammam");
        ll.add("karimnagar");
        ll.add("Adilabad");
        ll.add("Warangal");
        System.out.println(ll);
        ListIterator<String> ltr=ll.listIterator();
        while (ltr.hasNext()) {
           String str=ltr.next();
           if(str.contains("Adilabad")){
            ltr.remove();
            if(str.equals("Warangal")){
                ltr.set("Mulugu");
            }
            System.out.println(ll);
           }
            
        }

    }
    
}
