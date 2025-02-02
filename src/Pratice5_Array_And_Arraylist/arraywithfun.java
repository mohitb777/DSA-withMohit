package Pratice5_Array_And_Arraylist;

import java.util.Arrays;

public class arraywithfun {
    public static void main(String[] args) {
        int[] num = {5,8,4,6,4,5};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static void change(int[] arr) {
        arr[0] = 42;
    }
}
