package pratice_12_Math_For_Dsa;

public class find_the1noapper {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 5, 5, 5}; // Unique number is 3
        System.out.println("Unique number: " + findUnique(arr));
    }

    public static int findUnique(int[] arr) {
        int result = 0;

        // Iterate over each bit position (0 to 31 for integers)
        for (int i = 0; i < 32; i++) {
            int sum = 0;

            // Count how many numbers have the `i-th` bit set
            for (int j = 0; j < arr.length; j++) {
                int num = arr[j];
                if ((num & (1 << i)) != 0) { // Check if `i-th` bit is set
                    sum++;
                }
            }

            // If sum is not a multiple of 3, that bit belongs to the unique number
            if (sum % 3 != 0) {
                result |= (1 << i); // Set the `i-th` bit in the result
            }
        }

        return result; // Unique number
    }
}
