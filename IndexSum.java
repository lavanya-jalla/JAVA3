
import java.util.Scanner;

public class IndexSum {
   public static void main(String[] args) {
       int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("printing array of elements");
        for(int i=0;i<size;i++){
           
            System.out.print(" "+arr[i]);
        }
    
}
