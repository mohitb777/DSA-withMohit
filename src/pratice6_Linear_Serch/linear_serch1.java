package pratice6_Linear_Serch;

public class linear_serch1 {
    public static void main(String[] args) {
        int[] nums = {2, 8, 6, 7, 5, 7, 5, 7, 58, 5};
        int target = 7;
        int ans = linearSerch(nums, target);
        System.out.println(ans);
    }

    static int linearSerch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
