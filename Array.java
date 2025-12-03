import java.util.Arrays;
import java.util.Scanner;
public class Array {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
            sum+=arr[i];
        }
        for(int i:arr)
            
        System.out.println(i);
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+sum/arr.length);
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
            min=arr[i];
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("Min : "+min);
        System.out.println("Max : "+max);
        System.out.println("What the element you want to search: ");
        int x=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.println("Found at index: "+i);
                flag=true;
                break;
            }
        }
            if(flag==false){
                System.out.println("Elemnet not Found at index");
            
        }
        Arrays.sort(arr);
        System.err.println("Sotrted Array: ");
         for(int i:arr){
            System.err.println(i);
         }

        
        
        
    
        }
}
    

