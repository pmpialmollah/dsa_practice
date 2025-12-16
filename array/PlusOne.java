package array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        /*
         * Input: digits = [4,3,2,1]
         * Output: [4,3,2,2]
         */
        int[] numbers = { 9, 9 };
        System.out.println(Arrays.toString(plusOne(numbers)));

    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        if (digits[len - 1] != 9) {
            digits[len - 1] += 1;
            return digits;
        }
        int[] newArray = new int[len + 1];
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                newArray[i + 1] = 0;
            } else {
                newArray[i + 1] = digits[i] + 1;
                return newArray;
            }
        }
        newArray[0] = 1;
        return newArray;
    }
}
