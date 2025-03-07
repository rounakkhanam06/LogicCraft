package Array;

import java.util.*;
public class practice1 {
    public static int[] maxSlidingWindow(int arr[], int k){
        int n = arr.length;
        if (n == 0) return new int[0];
        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int maxVal = arr[i]; 
            for (int j = i; j < i + k; j++) {
                if (arr[j] > maxVal) {
                    maxVal = arr[j];  // Update max if a larger element is found
                }
            }
            result[i] = maxVal;
        }

        return result;

       
    }
    public static void main(String args[]){
        int arr[] = {22,3,4,11,6,74,34};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));
    }
}
