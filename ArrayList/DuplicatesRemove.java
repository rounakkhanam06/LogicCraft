 package ArrayList;
 
 import java.util.*;
 
 
 public class DuplicatesRemove{
    public static void main (String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Banana");

        System.out.println("original list: "+ list);

        HashSet<String> set = new HashSet<>(list);

        ArrayList<String> uniqueList = new ArrayList<>(set);
        System.out.println("List after removing duplicates: " + uniqueList);
    }
 }