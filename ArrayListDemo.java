
import java.util.*; 
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add("Lavanya");
        al.add(18);
        al.add("apple");
        al.add("Kmm");
        System.out.println(al);

        List<Integer> al2=new ArrayList<>();
        al2.add(30);
        al2.add(50);
        al2.add(10);
        Collections.sort(al2);
        System.out.println(al2);
        al.addAll(al2);

        al.remove(2);
        al.remove(5);
        System.out.println(al);
        for (Object obj : al) {
            System.out.println(obj);
            System.out.println("*********************");
            //univeral iterator
            Iterator itr=al.iterator();
            while (itr.hasNext()) {
               System.out.println( itr.next());
                
            }
            
        }
    }
    
}
