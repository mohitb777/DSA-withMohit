package pratice8_sortingalgo;

import java.util.Arrays;

public class setmismatchcyclicsort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 2, 6, 5};
        System.out.println("Duplicate and Missing Numbers: " + Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] arr) {
        int i = 0;

        // Cyclic sort to place numbers in the correct positions
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Find the duplicate and the missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index + 1}; // Duplicate, Missing
            }
        }

        return new int[] {-1, -1}; // If no error found
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
