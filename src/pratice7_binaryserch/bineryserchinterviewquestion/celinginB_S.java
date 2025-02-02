package pratice7_binaryserch.bineryserchinterviewquestion;

public class celinginB_S {

    public static void main(String[] args) {
        int[]a = {0,1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,99};
        int t =65;
        int ans = cealing(a , t);
        System.out.println(ans);

    }
    static int cealing(int[]arr,int target){
        if (target >arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2 ;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start ;

    }
}
