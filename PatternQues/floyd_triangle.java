package PatternQues;

public class floyd_triangle {
    public static void main(String[] args) {
        int rows = 5; // number of rows for the triangle
        int number = 1;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
