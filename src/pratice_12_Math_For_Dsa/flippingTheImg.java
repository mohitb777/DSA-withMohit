package pratice_12_Math_For_Dsa;

import java.util.Arrays;

public class flippingTheImg {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        int[][] result = flipAndInvertImage(image);

        // Printing the result
        for (int i = 0; i < result.length; i++) {
            int[] row = result[i];
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int j = 0; j < image.length; j++) {
            int[] row = image[j];
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;
            }
        }
        return image;
    }
}
