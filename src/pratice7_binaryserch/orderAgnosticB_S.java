package pratice7_binaryserch;

public class orderAgnosticB_S {
    public static void main(String[] args) {
        //int[]a = {0,1,2,3,4};
        int[]a = {4,3,2,1,0};
        int t =3;
        int ans = orderAgnosticBS(a , t);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[]arr, int target){
        int start =0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2 ;
            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
                return -1;
    }
}




