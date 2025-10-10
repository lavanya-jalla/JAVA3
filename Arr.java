import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array values: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(arr[i]==arr[j]){
            System.out.println("duplicate values"+arr[i]);
            count++;
            break;

        }
    }
}
    
    System.out.println("the count of duplicate values: "+count);
    }
    
}

