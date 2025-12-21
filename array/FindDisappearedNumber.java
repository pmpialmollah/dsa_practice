package array;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] expectedArray = new int[nums.length];
        int[] newArray = new int[nums.length];
        List<Integer> resultArray = new ArrayList<>();

        for (int i = 0; i < expectedArray.length; i++) {
            expectedArray[i] = i + 1;
        }
        for (int num : nums) {
            newArray[num - 1] = num;
        }

        for (int i = 0; i < newArray.length; i++) {
            if (expectedArray[i] != newArray[i]) {
                resultArray.add(i + 1);
            }
        }
        return resultArray;
    }
}