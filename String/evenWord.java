package String;
import java.util.Scanner;

public class evenWord {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       System.out.println("enetr a string: ");
        String str = sc.nextLine();

        // split the string into words
        String[] words = str.split("\\s+");

        System.out.println("even length words");

        for(int i=0; i<words.length; i++){
            if(words[i].length() %2 ==0){
                System.out.println(words[i]);
            }
        }
    }
}
