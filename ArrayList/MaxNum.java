package ArrayList;

import java.util.*;
public class MaxNum {
    public static void main(String args[]){
        ArrayList<Integer> Num = new ArrayList<>();
        Num.add(1);
        Num.add(90);
        Num.add(23);
        Num.add(12);
        Num.add(66);
        Num.add(34);

        int max = Integer.MIN_VALUE;
        // logic
        for(int i=0;i<Num.size(); i++){
            if(max < Num.get(i)){
                max = Num.get(i);
            }
        }
        System.out.println("max element is : " + max);
    }
}

// or can use 
// max = Math.max(max , Num.get(i));
