package array;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, -4, 5, 6, 7, 8, 9, 10};
        System.out.println(sumOfEvenNumbers(nums));
        
    }
    public static int sumOfEvenNumbers(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int num: nums){
            if (Math.abs(num) % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}
