package Array;

import java.util.Arrays;

public class DeleteElement {

    public static int[] delete(int[] arr, int index){
        int[] newArr = new int[arr.length-1];

        for(int i=0, j=0; i<arr.length; i++){
            if(i==index){
                continue;
            }
            newArr[j++] = arr[i];
            
        }
        return newArr;
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,66,73,5,57};

        int indexToDlt = 2;
        System.out.println("Original array: " + Arrays.toString(arr));
        arr = delete(arr, indexToDlt); // Update the array
        System.out.println("Array after deletion: " + Arrays.toString(arr));
    }
}
