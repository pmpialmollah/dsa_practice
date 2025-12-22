package array;

import java.util.Arrays;

public class UserSessionDuplication {
    public static void main(String[] args) {
        int[] sessionDetails = { 10, 10, 20, 30, 40, 40, 40, 40, 50 };
        System.out.println(sessionDuplication(sessionDetails));
        System.out.println(Arrays.toString(sessionDetails));
    }

    public static int sessionDuplication(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (index < 2 || array[i] != array[i-2]) {
                array[index] = array[i];
                index++;
            }
        }
        return index;
    }
}
