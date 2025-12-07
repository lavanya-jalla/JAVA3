import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
     public static void main(String[] args) throws IOException{
         BufferedReader br=new BufferedReader(new FileReader("BufferWriter.java"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("file2.txt"));
  
        // anynomous 
       
        
        int lcount=0;
        String Line;
        while((Line=br.readLine())!= null){
            bw.write("\n");
           bw.write(Line);
           System.out.println(Line);
           
            lcount++;
        }
        System.out.println("File Written Succesfully");
        System.out.println(lcount);
        br.close();
        bw.close();
        


}
}
