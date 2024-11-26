// swap two num based on given index num
// given list = 2,5,9,3,6   and index: idx1 = 1, idx2 =3 
// output = 2,3,9,5,6

package ArrayList;

import java.util.ArrayList;
public class SwapNum {

    public static void swap(ArrayList<Integer> num, int idx1, int idx2){
        int temp = num.get(idx1);
        num.set(idx1, num.get(idx2));
        num.set(idx2, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(5);
        num.add(9);
        num.add(3);
        num.add(6);

        int idx1 =1 , idx2 = 3;
        System.out.println(num);
        swap(num, idx1, idx2);
        System.out.println(num);

    }
}
