package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangleTwo {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> myList = new ArrayList<>();

        for(int i=0; i<rowIndex + 1; i++){
            List<Integer> list = new ArrayList<>(Collections.nCopies(i+1, 1));
            for (int j=1; j<i; j++){
                int val = myList.get(i-1).get(j) + myList.get(i-1).get(j-1);
                list.set(j, val);
            }
            myList.add(list);
        }

        return myList.get(rowIndex);
    }
}
