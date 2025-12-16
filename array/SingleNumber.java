package array;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
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
