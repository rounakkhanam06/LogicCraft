package SortingAlgo;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int n= arr.length;
        int count =0;  // Count of swaps
        boolean swapped = false;
        int temp=0 ;
        for(int i=0;i<n-1;i++){
            swapped=true;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // swapping
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    count++;
                    swapped = true;

                    
                }
            }
            if (!swapped) {
                break;
        }
    }
    System.out.println("Sorted array: ");
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println("\nTotal swaps: " + count);
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    
    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
    }

  
    bubbleSort(arr);

    scanner.close();
}
}

