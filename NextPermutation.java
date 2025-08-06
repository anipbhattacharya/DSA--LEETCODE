import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Step 2: If such element found, find the next greater element and swap
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }

        // Step 3: Reverse the part after index i
        reverse(arr, i + 1, n - 1);
    }

    // Utility method to swap two elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Utility method to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    // Main method to test it
    public static void main(String[] args) {
        int[] arr = {2,1,6,5,4,3};
        System.out.println("Original: " + Arrays.toString(arr));

        nextPermutation(arr);

        System.out.println("Next Permutation: " + Arrays.toString(arr));
    }
}
