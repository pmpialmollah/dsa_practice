package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {

        /*
         * Given a non-empty array of integers nums, every element appears twice except
         * for one. Find that single one.
         * You must implement a solution with a linear runtime complexity and use only
         * constant extra space.
         * Input: nums = [4,1,2,1,2]
         * Output: 4
         */
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int num : nums) {
            if (myMap.containsKey(num)) {
                myMap.put(num, myMap.get(num) + 1);
            } else {
                myMap.put(num, 1);
            }
        }
        for (Integer num : myMap.keySet()) {
            if (myMap.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }
}
