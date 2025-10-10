
import java.util.ArrayList;

public class AddIntElements {
    ArrayList al=new ArrayList();
    public void AddItems(){
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al.get(2));
        al.remove(2);
        System.out.println(al);
        // al.get(0);
        System.out.println(al.get(0));
        System.out.println(al.get(2));
        System.out.println(al.get(3));

    }
    public static void main(String[] args) {
        AddIntElements a=new AddIntElements();
        a.AddItems();
    }
    
}
