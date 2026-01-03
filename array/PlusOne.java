package array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        /*
         * Input: digits = [4,3,2,1]
         * Output: [4,3,2,2]
         */
        int[] numbers = { 1, 2, 3 };
        System.out.println(Arrays.toString(plusOne(numbers)));

    }

    public static int[] plusOne(int[] digits) {
        int lenOfArray = digits.length;
        
        for (int i = lenOfArray - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] modifiedNumbers = new int[lenOfArray + 1];
        modifiedNumbers[0] = 1;
        return modifiedNumbers;
    }
}
