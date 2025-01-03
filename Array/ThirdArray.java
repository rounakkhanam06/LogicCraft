package Array;

import java.util.*;
public class ThirdArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first array limit: ");
        int l = sc.nextInt();
        System.out.println("enter the second array limit: ");
        int m = sc.nextInt();
        int n=0;

        int a[] = new int[l];
        int b[] = new int[m];
        int c[] = new int[l+m];

        System.out.println("Enter "+ l + " Array elements:");
        for(int i=0; i<l; i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter "+ m + " Array elements:");
        for(int i=0; i<m; i++){
            b[i]=sc.nextInt();
        }

        
        for(int i=0; i<l; i++){
            c[n] = a[i];
            n++;
        }

        for(int i=0; i<m; i++){
            c[n] = b[i];
            n++;
        }

        System.out.println("Merged array is : ");
        for(int i=0; i<n; i++){
            System.out.println(c[i] +" ");
        }
        
    }
    
}
