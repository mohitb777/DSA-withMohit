package pratice6_Linear_Serch;

public class leetcodefindthe_even_no_of_digit {
    public static void main(String[] args) {
        int[] nums = {12, 4, 8, 6, 1, 2, 33, 555, 755655};
        System.out.println(find(nums));
    }

    static int find(int[] nums) {
        int count = 0;
     /*   for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }*/

        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) {
                count++;
            }
        }

        return count; // Return the count after the loop
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if (num == 0) {
            return 1; // Special case for 0
        }
        if (num < 0) {
            num = num * -1; // Convert negative to positive
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count; // Return the number of digits
    }
}
