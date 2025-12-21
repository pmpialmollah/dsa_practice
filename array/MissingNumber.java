package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {

        int[] nums = {0,1, 3};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int min = nums[0];

        Set<Integer> mySet = new HashSet<>();
        for (int num : nums) {
            mySet.add(num);
        }
        for (int i = min; i <= max; i++) {
            if (!mySet.contains(i)) {
                return i;
            }
        }
        if (min > 0) {
            return 0;
        }
        return max + 1;
    }
}
