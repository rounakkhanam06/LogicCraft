package PatternQues;

public class HollowRhombus {
    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for the rhombus shape
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            
            // Print stars and spaces for the hollow pattern
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;  // Number of rows (or columns)
        hollow_rhombus(n);  // Call the method to print the hollow rhombus
    }
}







