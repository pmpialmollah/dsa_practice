package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        /*
         * Example 1:
         * Input: nums1 = [1,2,2,1], nums2 = [2,2]
         * Output: [2]
         * Example 2:
         * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
         * Output: [9,4]
         * Explanation: [4,9] is also accepted.
         */
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> resSet = new HashSet<>();
        Set<Integer> numOne = new HashSet<>();
        for (int num : nums1) {
            numOne.add(num);
        }
        for (int num : nums2) {
            if (numOne.contains(num)) {
                resSet.add(num);
            }
        }
        int[] res = new int[resSet.size()];
        int index = 0;
        for (int num : resSet) {
            res[index] = num;
            index++;
        }
        return res;
    }
}
