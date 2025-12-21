package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        
        int[] nums = {  2, 1 };
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int num : nums) {
            mySet.add(num);
        }
        int[] newArray = new int[mySet.size()];

        int index = 0;
        for (int num : mySet) {
            newArray[index] = num;
            index++;
        }

        Arrays.sort(newArray);

        if (newArray.length > 2) {
            return newArray[newArray.length - 3];
        }

        return newArray[newArray.length - 1];
    }
}
