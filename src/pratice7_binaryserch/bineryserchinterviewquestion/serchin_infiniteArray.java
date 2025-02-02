package pratice7_binaryserch.bineryserchinterviewquestion;

public class serchin_infiniteArray {
    public static void main(String[] args) {
// example array
        int[] arr = {3,4,5,6,7,8,9,33,44,55,66,77,88,99,170};
        int target = 33;
       // System.out.println(ans(arr,target));
        int put = ans(arr,target);
        System.out.println(put);

    }
     static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        //condition for target to lie in range
        while (target > arr[end]){
            int temp = end +1;
            //double the box
            //end = previous end + sizeofbox*2
        end = end + (end - start + 1) *2;
        start = temp;
        }
        return binarySerch(arr,target,start,end);

     }
    static int binarySerch(int[]arr,int target, int start ,int end){

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
        return -1 ;

    }
}
