import java.io.*;
public class FileWr {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("FileWr.java");
        // File f=new File("file1.txt");
        FileWriter fw=new FileWriter("file1.txt");
        // fw.write("Javaa is an object oriented programming language\nIt is dynamic,robust and platform independnet\n");
        // fw.close();
        int x,count=0;
        while((x=fr.read())!= -1){
            fw.write(x);
            System.out.print((char)x);
            count++;
        }
        System.out.println("File Written Succesfully");
        System.out.println(count);
        fr.close();
        fw.close();




    }
    
}
