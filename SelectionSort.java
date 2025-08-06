import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        int[] sortedArr = selectionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }
}
