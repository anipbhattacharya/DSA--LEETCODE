public class MaxSubarraySum {
    public static void maxsubarrayssum(int arr[]) {
        int i, j, k,sum=0;

        for (i = 0; i < arr.length; i++) {
            for (j = i; j < arr.length; j++) {
                
                for (k = i; k <= j; k++) {
                    sum+=arr[k];
                }
                System.out.println(sum);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, -2, 6,-1, 3};
        maxsubarrayssum(arr);
    }
}

    