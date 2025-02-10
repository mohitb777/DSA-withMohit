package Pratice_16_Recursion_Pattern_And_Bubble_selection_Merge_Quick_SortingAlgo;

import java.util.Arrays;

public class quickSortRE  {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        //sort(arr,0, arr.length-1);
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr);
    }
    static void sort(int[] nums,int low, int hi){
        if(low >= hi){
            return;
        }
        int s = low;
        int e = hi ;
        int m = s + (e-s)/2;
        int pivot = nums[m];
        while (s <= e){
            while (nums[s] < pivot){
                s++;
            }
            while (nums[e] > pivot){
                e--;
            }
            if ( s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        sort(nums,low,e);
        sort(nums,s,hi);
    }
}
