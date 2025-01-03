package Array;
import java.util.*;

public class MergeArray {
    public static void Merge(int[] arr1, int[] arr2 ,int m, int n){
   
       for(int i=0; i<n; i++){
        arr1[m+i] = arr2[i];

       }
       Arrays.sort(arr1);
       System.out.println(Arrays.toString(arr1));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter nummber of element in first array and second array");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m+n];
        System.out.println("Enter " + m + " elements for the first array:");
        for(int i=0; i<m; i++){
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        System.out.println("Enter " + n + " elements for the second array:");
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }

        Merge(arr1, arr2, m, n);
       
    }
}
