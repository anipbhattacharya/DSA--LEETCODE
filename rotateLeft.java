public class rotateLeft{

    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;  // Handle cases where d > n

        int[] temp = new int[n];

        // Step 1: Copy arr[d → n-1] to temp[0 → n-d-1]
        for (int i = d; i < n; i++) {
            temp[i - d] = arr[i];
        }

        // Step 2: Copy arr[0 → d-1] to temp[n-d → n-1]
        for (int i = 0; i < d; i++) {
            temp[n - d + i] = arr[i];
        }

        // Step 3: Copy temp[] back to arr[]
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;

        leftRotate(arr, d);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
