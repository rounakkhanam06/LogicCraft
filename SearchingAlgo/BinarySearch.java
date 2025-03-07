package SearchingAlgo;
  // array must be sorted in binary search 

public class BinarySearch {
    public static int binarySearch(int[] arr, int target ){
        int low =0;
        int high = arr.length-1;

        while (low<=high){
            int mid = low + (high - low) / 2;

            if(arr[mid]== target){
                return mid;
            }
            if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1; 


    }
    public static void main(String args[]){
       int arr[] = {2,4,55,89,56,32,1,90};
       int target = 55;
       int result = binarySearch(arr, target);

       if(result != -1){
        System.out.println("element is found at index " + result);
       }else{
        System.out.println("Element not found");
       }
    }
}
