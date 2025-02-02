package pratice8_sortingalgo;

public class firstmissingpositive {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println("Missing Number: " + firstpositivemissingno(arr));
    }

    public static int firstpositivemissingno(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Find the missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1 ) {
                return index+1;
            }
        }

        // If no number is missing, return n
        return arr.length +1 ;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
