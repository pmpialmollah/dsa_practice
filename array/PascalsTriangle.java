package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        List<List<Integer>> triangle = generate(5);
        System.out.println(triangle);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>(Collections.nCopies(i + 1, 1));
            if (i > 1) {
                for (int j = 1; j < list.size() - 1; j++) {
                    int val = pascalsTriangle.get(i - 1).get(j - 1) + pascalsTriangle.get(i - 1).get(j);
                    list.set(j, val);
                }
            }
            pascalsTriangle.add(list);
        }
        return pascalsTriangle;
    }
}