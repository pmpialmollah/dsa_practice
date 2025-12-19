package array;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicateTwo {
    public static void main(String[] args) {
        // Input: nums = [1,2,3,1,2,3], k = 2
        // Output: false

        int[] nums = { 1, 5, 1, 0 };
        System.out.println(containsNearbyDuplicate(nums, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            myHashMap.put(i, nums[i]);
        }

        int preIndex = 0;
        for(int num: myHashMap.keySet()){
            
        }

        System.out.println(myHashMap);
        return false;
    }
}
