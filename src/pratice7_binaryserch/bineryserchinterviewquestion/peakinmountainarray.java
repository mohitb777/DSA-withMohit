package pratice7_binaryserch.bineryserchinterviewquestion;

public class peakinmountainarray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9,33,32,16,11};

        int put = peakIndexInMountauinArray(arr);
        System.out.println(arr[put]);

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
}
