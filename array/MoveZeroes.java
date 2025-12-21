package array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {

        /*
         * Example 1:
         * Input: nums = [0,1,0,3,12]
         * Output: [1,3,12,0,0]
         * Example 2:
         * Input: nums = [0]
         * Output: [0]
         */
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        for(int i=count; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}
