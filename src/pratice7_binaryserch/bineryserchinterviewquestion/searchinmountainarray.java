package pratice7_binaryserch.bineryserchinterviewquestion;

public class searchinmountainarray {
        public static void main(String[] args) {
            int[] arr = {3,4,5,6,7,8,9,33,44,55,66,77,88,99,170,12,11,10};
            int target = 44;
            // System.out.println(ans(arr,target));
            int put = search(arr,target);
            System.out.println(arr[put]);
        }

     static  int search(int[] arr , int target) {
            int peak = peakIndexInMountauinArray(arr);
            int firstTry = orderAgnosticBS(arr, target, 0, peak);
            if (firstTry != -1) {
                return firstTry;
            }
           return orderAgnosticBS(arr,target,peak+1,arr.length-1);
        }
        static int peakIndexInMountauinArray(int[] arr){
            int start = 0 ;
            int end = arr.length-1;

            while (start < end){
                int mid = start + (end - start ) / 2;
                if (arr[mid] > arr[mid+1]) {
                    end = mid;
                }else {
                    start = mid + 1;
                }
            }
            return start;
        }


static int orderAgnosticBS(int[]arr, int target, int start, int end){

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

