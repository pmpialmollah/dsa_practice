package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrayTwo {
    public static void main(String[] args) {

        /*
         * Example 1:
         * Input: nums1 = [1,2,2,1], nums2 = [2,2]
         * Output: [2,2]
         * Example 2:
         * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
         * Output: [4,9]
         * Explanation: [9,4] is also accepted.
         */
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> myList = new ArrayList<>();

        Map<Integer, Integer> numOne = new HashMap<>();
        Map<Integer, Integer> numTwo = new HashMap<>();

        for (int num : nums1) {
            numOne.put(num, numOne.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            numTwo.put(num, numTwo.getOrDefault(num, 0) + 1);
        }

        if (numOne.size() > numTwo.size()) {
            for (int num : numTwo.keySet()) {
                if (numOne.containsKey(num)) {
                    while (true) {
                        if (numOne.get(num) == 0 || numTwo.get(num) == 0) {
                            break;
                        }
                        myList.add(num);
                        numOne.put(num, numOne.get(num) - 1);
                        numTwo.put(num, numTwo.get(num) - 1);
                    }
                }
            }
        } else {
            for (int num : numOne.keySet()) {
                if (numTwo.containsKey(num)) {
                    while (true) {
                        if (numOne.get(num) == 0 || numTwo.get(num) == 0) {
                            break;
                        }
                        myList.add(num);
                        numOne.put(num, numOne.get(num) - 1);
                        numTwo.put(num, numTwo.get(num) - 1);
                    }
                }
            }
        }

        System.out.println(numOne);
        System.out.println(numTwo);

        int[] res = new int[myList.size()];
        int index = 0;
        for (int num : myList) {
            res[index] = num;
            index++;
        }
        return res;
    }
}
