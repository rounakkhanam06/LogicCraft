package SortingAlgo;

import java.util.Scanner;

public class CountingSort {

    
    public static void countingSort(int[] arr) {
      
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

       
        int[] count = new int[largest + 1];

     
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //  sorted array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements (non-negative integers only):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] < 0) {
                System.out.println("Negative numbers are not allowed. Please enter only non-negative integers.");
                return; 
            }
            scanner.close();
        }

      
        countingSort(arr);

      
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}


