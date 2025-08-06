import java.util.*;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        // Map to store prefix sums and their frequency
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Base case: prefix sum 0 exists once

        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
         sum += num;

            // Check if there's a prefix sum that makes current sum - k
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Store/update the frequency of this prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3};
        int k = 3;

        int result = subarraySum(nums, k);
        System.out.println("Total subarrays with sum = " + k + " is: " + result);
    }
}
