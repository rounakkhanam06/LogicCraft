package PatternQues;

import java.util.Scanner;

public class TriangleNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows do you want in this pattern?");
        int row = sc.nextInt();

        System.out.println("Here is your pattern....!!!");

        // Logic clear
        
        for (int i = 1; i <= row; i++) {
            // Printing (rows - i) spaces at the beginning of each row
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

           
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            
            System.out.println();
        }

        sc.close();
    }
}

