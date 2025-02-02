
package pratice7_binaryserch;

public class ninaridecending {
    public static void main(String[] args) {
        int[]a = {99,88,77,66,55,44,33,22,11,9,8,7,6,5,4,3,2,1};
        int t =11;
        int ans = binarySerch(a , t);
        System.out.println(ans);

    }
    static int binarySerch(int[]arr,int target){
        int start =0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2 ;
            if(target > arr[mid]){
                end = mid - 1;
            }
            else if (target < arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1 ;

    }
}

