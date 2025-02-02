package pratice6_Linear_Serch;

import java.util.Arrays;

public class serchin2Darray {  // Corrected class name
    public static void main(String[] args) {
        int[][] arr = {
                {4, 5, 8},
                {45, 98, 81},
                {26, 49, 20, 62}
        };
        int tar = 5;
        int[] ans = search(arr, tar);  // Corrected method call
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {  // Corrected method name
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
