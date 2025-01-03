package String;

public class evenChar {
    public static void main(String args[]){
        String str = "hello";

        System.out.println("character at even indices");
        for(int i=0; i<str.length(); i+=2){
            System.out.println(str.charAt(i));
        }
    }
}
