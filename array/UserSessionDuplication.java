package array;

import java.util.Arrays;

public class UserSessionDuplication {
    public static void main(String[] args) {
        int[] sessionDetails = { 10, 10, 20, 30, 40, 40, 40, 40, 50 };
        System.out.println(sessionDuplication(sessionDetails));
        System.out.println(Arrays.toString(sessionDetails));
    }

    public static int sessionDuplication(int[] array) {
        int index = 0;
        int count = 0;
        int leftValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != leftValue) {
                leftValue = array[i];
                count = 0;
            }
            if (count < 2) {
                array[index] = leftValue;
                index++;
                count++;
            }
        }
        return index;
    }
}
