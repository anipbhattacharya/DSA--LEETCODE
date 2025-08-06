import java.util.Arrays;

public class pos_neg_arrange {
    public static void arrange(int arr[]) {
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int posIndex = 0, negIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[posIndex++] = arr[i];
            } else {
                neg[negIndex++] = arr[i];
            }
        }

       
        int[] res = new int[n];
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                res[i] = pos[j++];
            } else {
                res[i] = neg[k++];
            }
        }

        // Print result
        System.out.println("Arranged array: " + Arrays.toString(res));
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, -2, -5, 2, -4};
        arrange(arr);
    }
}
