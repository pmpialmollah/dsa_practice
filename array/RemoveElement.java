package array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        System.out.println(removeElement(nums, 2));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 1 && nums[0] != val) {
            return 1;
        }
        int num = 0;
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                newArray[num] = nums[i];
                num++;
            }
        }
        for (int i = 0; i < num; i++) {
            nums[i] = newArray[i];
        }
        return num;
    }
}
