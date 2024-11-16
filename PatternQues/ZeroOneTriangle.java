package PatternQues;

import java.util.Scanner;

public class ZeroOneTriangle {
                 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of rows for the triangle
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        
        // Loop to print the 0-1 triangle pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print 1 if the sum of i and j is even, otherwise print 0
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1");
                } else {
                    System.out.print(" 0");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
        
        scanner.close();
}
}
