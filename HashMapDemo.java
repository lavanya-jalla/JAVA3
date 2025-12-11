import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        // Map<Integer,String> m=new HashMap();//insertion of random order
        // Map<Integer,String> m=new LinkedHashMap<>();//insertion  order
        Map<Integer,String> m=new TreeMap<>(new MyComp());//Ascending  order
        m.put(108, "pm");
        m.put(104, "cm");
        m.put(101, "abc");
        m.put(161, "pm");
        m.put(181, "mp");
        m.put(101, "mla");
        System.out.println(m);
        Collection c1=m.keySet();
        System.out.println(c1);
        Collection c2=m.values();
        System.out.println(c2);
        Set s=m.entrySet();
        Iterator itr=s.iterator();
        System.out.println("Key \t Value");
        while (itr.hasNext()) {
            Map.Entry me =(Map.Entry)  itr.next();
            System.out.println(me.getKey()+"\t"+me.getValue());
            
        }

    }
}
class MyComp implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        Integer i1=(Integer)o1;
        Integer i2=(Integer)o2;
        return i2.compareTo(i1);
    }

}
