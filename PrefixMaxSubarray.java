public class PrefixMaxSubarray {
    public static void maxSubarraySum(int[] numbers) {
        int n = numbers.length;
        int[] prefix = new int[n];
        
        // Step 1: Build prefix sum array
        prefix[0] = numbers[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0, endIndex = 0;

        // Step 2: Try all subarrays
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;

                int currSum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];

                if (currSum > maxSum) {
                    maxSum = currSum;
                    startIndex = start;
                    endIndex = end;
                }
            }
        }

        // Step 3: Output result
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.print("Subarray: ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
    }
}
