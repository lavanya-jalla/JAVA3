import java.io.*;

public class SerializableTest {
    public static void main(String[] args) throws Exception {
        Person p1=new Person("Lavanya",19,80302290390L);
        System.out.println(p1);
        //serializable
        FileOutputStream fos=new FileOutputStream("person.data");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(p1);

        //deserialaizable
        FileInputStream fis=new FileInputStream("person.data");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Person p2=(Person) ois.readObject();
        System.out.println(p2);

    }
    
}
