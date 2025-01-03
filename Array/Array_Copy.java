package Array;

import java.util.*;
public class Array_Copy {
  
    public static void main(String args[]){
      
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the limit of array input : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] copyarr = new int[size];

        System.out.println("enter "+ size + " elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            copyarr[i] = arr[i];
        }

        System.out.println("original array is : ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        System.out.println("copied array : ");
        for(int i=0; i<size; i++){
            System.out.print(copyarr[i] + " ");
        }
   sc.close();
    }
    

}
