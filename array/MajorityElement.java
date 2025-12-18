package array;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

        /*
         * Input: nums = [2,2,1,1,1,2,2]
         * Output: 2
         */

        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int num : nums) {
            if (myMap.containsKey(num)) {
                myMap.put(num, myMap.get(num) + 1);
            } else {
                myMap.put(num, 1);
            }
        }
        int val = 0;
        int res = 0;
        for (int key : myMap.keySet()) {
            if (myMap.get(key) > val) {
                res = key;
                val = myMap.get(key);
            }
        }
        return res;
    }
}
