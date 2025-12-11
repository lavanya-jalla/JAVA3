class MyGen<T>{
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}
public class MyGenDemo {
    public static void main(String[] args) {
        MyGen<Integer> g1=new MyGen();
        g1.add(20);
        System.out.println(g1.get());
        // g1.add("ramaa"); compile time errror

        MyGen<String> g2=new MyGen();
        g2.add("Lavanya");
        System.out.println(g2.get());
        
    }
    
}
