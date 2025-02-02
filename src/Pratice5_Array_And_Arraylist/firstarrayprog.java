package Pratice5_Array_And_Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class firstarrayprog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 14;
        arr[1] = 144;
        arr[2] = 134;
        arr[3] = 124;
        arr[4] = 114;

        System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");


            System.out.println(Arrays.toString(arr));
        }
    }
}