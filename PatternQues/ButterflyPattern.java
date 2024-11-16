package PatternQues;


public class ButterflyPattern {
    public static void butterflyPattern(int n) {
        // Upper part of the butterfly pattern
        for (int i = 1; i <= n; i++) {
            // Left half stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right half stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the butterfly pattern
        for (int i = n; i >= 1; i--) {
            // Left half stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right half stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;  // Number of rows 
        butterflyPattern(n); 
    }
}



