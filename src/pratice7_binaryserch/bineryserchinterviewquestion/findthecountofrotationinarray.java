package pratice7_binaryserch.bineryserchinterviewquestion;

public class findthecountofrotationinarray {
    public static void main (String[] args){

             int[] arr = {4,5,6,7,55,54};

       // int put = findpivot(arr);
        System.out.println(countRotatioms(arr));
    }
    static int countRotatioms(int[] arr) {
        int pivot = findpivot(arr);
        return pivot + 1;
    }
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length -1 ;
        while (start <= end){
            int mid = start +(end - start) / 2;
            if(mid < end && arr[mid] > arr [mid + 1]){
                return mid;
            }
            if (arr[mid] < arr [mid-1] ){
                return  mid - 1;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }
        else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
