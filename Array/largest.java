package Array;

public class largest {
    public static void largestNum(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
        }
        System.out.println("The largest number is: " + largest);
    }
    public static void main(String args[]){
        int [] arr = {22,12,34,55,67,23};
        largestNum(arr);
    }
}
