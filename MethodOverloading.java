public class MethodOverloading {
    public void display(){
        System.out.println("No Argument");

    }
    public void display(String name){
        System.err.println("Name: "+name);
    }
    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.display();
        mo.display("Lavanya");
    }
    
}
