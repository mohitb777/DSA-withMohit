package Pratice3_Func_and_Methods;

import java.util.Arrays;

public class changeValueRealswap {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,2,4,5,8,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 85;
    }
}
