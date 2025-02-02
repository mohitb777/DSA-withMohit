package Pratice11_Recursion;

public class Binery_serch_with_recursion {
    public static void main(String[] args) {
       int [] arr = {4,5,7,8,9,44,55,66,77};
     int target = 77;
       int  a = BS(arr,target,0, arr.length-1);
        System.out.println(a);
    }
    static int BS (int[]arr, int target,int s,int e){
        if (s > e) {
            return -1;

        }
        int m = s + (e-s)/2;
        if (arr [m] == target){
            return m;
        }
        if (target < arr [m]) {
            return BS(arr, target, s, m - 1);
        }
        return BS (arr,target,m+1,e);
        }
    }

