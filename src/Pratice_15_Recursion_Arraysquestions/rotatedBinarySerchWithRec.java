package Pratice_15_Recursion_Arraysquestions;

public class rotatedBinarySerchWithRec {
    public static void main(String[] args) {
int [] N = {5,6,7,8,9,1,2,3};
        System.out.println(serch(N,6,0, args.length-1));
    }
    static int serch(int[]arr, int target, int s,int e){
        if (s > e) {
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if (arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return serch(arr,target,s,m+1);
            }else {
                return  serch(arr,target,m+1,e);
            }
        }
        if (target >= arr[m] && target <= arr[e]){
            return serch(arr,target,m+1,e);
        }else {
            return  serch( arr,target,s,m-1);
        }
    }
}
