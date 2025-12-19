package array;

public class ContainsDuplicateTwo {

    public static void main(String[] args) {
        /*
         * Example 1:
         * 
         * Input: nums = [1,2,3,1], k = 3
         * Output: true
         * Example 2:
         * 
         * Input: nums = [1,0,1,1], k = 1
         * Output: true
         * Example 3:
         * 
         * Input: nums = [1,2,3,1,2,3], k = 2
         * Output: false
         */

        int[] nums = { 1, 2, 3, 1, 2, 3 };
        System.out.println(containsNearbyDuplicate(nums, 3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        int right = 1;

        while (left < nums.length - 1) {
            while (right - left <= k && right < nums.length) {
                if (nums[left] == nums[right]) {
                    return true;
                }
                right++;
            }
            left++;
            right = left + 1;
        }
        return false;
    }

}