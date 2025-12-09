
import java.io.Serializable;

public class Person implements Serializable{
   
        private String name;
        private int age;
        transient private long aadhar;
        public Person(String name,int age,long aadhar){
            this.name=name;
            this.age=age;
            this.aadhar=aadhar;

        }
        @Override
        public String toString(){
        return "[Name: "+name+" Age: "+age+" Aadhar: "+aadhar+"]";
        }
     

    
    
}
