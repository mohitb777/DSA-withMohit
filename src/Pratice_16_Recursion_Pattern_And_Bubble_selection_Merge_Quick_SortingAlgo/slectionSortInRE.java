package Pratice_16_Recursion_Pattern_And_Bubble_selection_Merge_Quick_SortingAlgo;

import java.util.Arrays;

public class slectionSortInRE {
    public static void main(String[] args) {
        int[] arr = {5,8,4,6,8,7,2,};
        selectiom(arr, arr.length ,0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void selectiom(int[] arr, int r, int c,int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selectiom(arr, r, c + 1, c);

            } else {
                selectiom(arr, r, c + 1, max);

            }

        }else {
            int temp = arr[max];
        arr[max] = arr[r-1];
        arr[r-1] = temp;
        selectiom(arr,r-1,0,0);
        }

    }
}
