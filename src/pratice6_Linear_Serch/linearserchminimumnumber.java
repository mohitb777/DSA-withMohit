package pratice6_Linear_Serch;

public class linearserchminimumnumber {

    public static void main(String[] args) {
        int[] nums = {2, 8, 6, 7, 5, 7, 5, 7, 58, 5};
       // int target = 7;

        System.out.println(linearSerch(nums));
    }

    static int linearSerch(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        System.out.print("this is the min ans " );
        return ans;
    }
}