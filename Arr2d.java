import java.util.Scanner;


public class Arr2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][4];
        int[][] x={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i <3; i++) {
        for (int j = 0; j <3; j++) {
            System.out.print(x[i][j]+" ");
            System.out.println();

        }
           
       }


       for (int i = 0; i <3; i++) {
        for (int j = 0; j <4; j++) {
            arr[i][j]=sc.nextInt();
        }
           
       }
       for (int i = 0; i <3; i++) {
        for (int j = 0; j <4; j++) {
            System.out.print(arr[i][j]+" ");
            System.out.println();

        }
           
       }

    }
    
}
