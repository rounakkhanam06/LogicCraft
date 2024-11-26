package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWate {
    public  static int storeWater(ArrayList<Integer> heights){
        int maxWater =0;

        for(int i=0;i<heights.size(); i++){
            for(int j=i+1; j<heights.size(); j++){

                // calculate height and width
                 int height = Math.min(heights.get(i), heights.get(j));
                 int width = j-i;

                 int area = height*width;

                 maxWater = Math.max(area,maxWater);

            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> heights = new ArrayList<>();

        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

         // Find and print the maximum area
         System.out.println("Maximum area: " + storeWater(heights));
    }
}
