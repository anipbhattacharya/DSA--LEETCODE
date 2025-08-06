public class subarrays1 {

    public static void printsubarrays(int arr[]) {
        int i, j, k;

        for (i = 0; i < arr.length; i++) {
            for (j = i; j < arr.length; j++) {
                for (k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        printsubarrays(arr);
    }
}
