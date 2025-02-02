package pratice7_binaryserch.bineryserchinterviewquestion;

public class first_and_last_accuranceof_the_element {
    public static void main(String[] args) {
    }
         int[] serchRange ( int[] nums, int target){
            int[] ans = {-1, -1};

            int start = search(nums, target, true);
            int end = search(nums, target, false);
            ans[0] = start;
            ans[1] = end;

            return ans;
        }

    int search(int[] nums, int target,boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            }

        }
        return ans;


    }
}
