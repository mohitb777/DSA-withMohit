package pratice7_binaryserch.bineryserchinterviewquestion;

public class rotatedBSWithduplicates {
    public static void main(String[] args) {

        int[] arr = {2,2,2,2,2,2,5,2,2,1};
        int target = 5;
        int result = search(arr, target);
        System.out.println(result);

    }

    static int search(int[] nums, int target) {
        int pivot = findpivotwithduplicate(nums);
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
            if (target >= nums[0]) {
                return binarySearch(nums, target, 0, pivot - 1);
            }
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }


        static int binarySearch ( int[] arr, int target, int start, int end){
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }

        static int findpivotwithduplicate(int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }
             if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                 if (arr[start] > arr [start + 1]) {
                     return start;
                 }
                 start++;
         if(arr[end] < arr[end-1] ){
             return end -1;
         }
         end --;
             } else if (arr[start] <arr [mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                 start = mid + 1;
             }else{
                 end = mid - 1;
                    }
            }
            return -1;


        }
}