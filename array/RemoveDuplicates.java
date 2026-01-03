package array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] numbers = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(numbers));
        System.out.println(Arrays.toString(numbers));

    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        int totalDistinctNumber = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[totalDistinctNumber] = nums[i + 1];
                totalDistinctNumber++;
            }
        }

        return totalDistinctNumber;
    }
}
