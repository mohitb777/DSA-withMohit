package pratice8_sortingalgo;

import java.util.ArrayList;
import java.util.List;

public class CyclicSortDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println("Duplicates: " + findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] arr) {//all the duplicate
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            // Place the number in its correct position if it's not already there
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Find duplicates
        List<Integer> duplicates = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                duplicates.add(arr[index]);
            }
        }
        return duplicates;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
