
import java.util.Scanner;

public class MoveZeroesEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<n){
            arr[j]=0;
            j++;
        }
        System.out.println("Array with end zeroes");
        for(int num:arr){
            System.out.print(num + " ");
        }
        
      

    }
    
}
