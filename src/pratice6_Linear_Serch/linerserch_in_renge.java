package pratice6_Linear_Serch;
public class linerserch_in_renge {
    public static void main(String[] args) {
        int[] nums = {2, 8, 6, 7, 5, 7, 5, 7, 58, 5};
        int target = 7;

        System.out.println(linearSerch(nums,target,5,7));
    }

    static int linearSerch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;

        }
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
