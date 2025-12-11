import java.util.*;
abstract class Shape{
    abstract void draw();
}
class Rect extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

public class GenericMethodDemo {
  
    public static void drawShapes(List<? extends Shape>Lists){
        for(Shape s:Lists){
            s.draw();
        }


    }
    public static void main(String[] args) {
        List<Rect> list1=new ArrayList<Rect>();
        list1.add(new Rect());
        List<Circle> list2=new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());
        drawShapes(list1);
        drawShapes(list2);

    }
        
    }
    

