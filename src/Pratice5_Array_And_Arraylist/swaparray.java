package Pratice5_Array_And_Arraylist;

import java.util.Arrays;

public class swaparray {
    public static void main(String[] args) {
        int [] arr = {2,4,5,5,9,6,7};
       change(arr,0,4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }
    static void change(int[] arr, int a,int b){
        int H = arr[a];
        arr[a] = arr[b];
        arr[b] = H;
    }
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

            }


        }
        return max;
        /*static void reverse(int[] arr) {
            int start = 0 ;
            int end = arr.length-1;
            while (start < end){
                change(arr, start, end);
                start++;
                end--;*/
    }
            static void reverse(int[] arr) {
                int start = 0 ;
                int end = arr.length-1;
                while (start < end){
                    change(arr, start, end);
                    start++;
                    end--;

                }
    }
}
