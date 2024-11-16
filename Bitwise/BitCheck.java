package Bitwise;

import java.util.Scanner;

public class BitCheck {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a  binary number: ");
        int num = scanner.nextInt();

        System.out.print("Enter the bit position to check bit : ");
        int n = scanner.nextInt();

        if ((num & (1 << n)) != 0) {
            System.out.println("The " + n + "th bit is set (1).");
        } else {
            System.out.println("The " + n + "th bit is not set (0).");
        }
        scanner.close();
     }
    
}
