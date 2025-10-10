@FunctionalInterface
interface A{
    int  show(int i,int y);
    
}
// class B implements A{
//     public void show(){
//         System.out.println("hloo");
//     }
// }

public class Lambda {
    public static void main(String[] args) {
        
    
    A obj = (i, y) -> i + y;
          int result = obj.show(5, 4);
          System.out.println(result);
    }
        
    //         public void show(){
    // }
    //     };
    //     obj.show();
       
    // }
    
}

