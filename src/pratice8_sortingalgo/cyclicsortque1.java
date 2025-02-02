package pratice8_sortingalgo;

import java.util.Arrays;

public class cyclicsortque1 {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println("Missing Number: " + missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Find the missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // If no number is missing, return n
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
