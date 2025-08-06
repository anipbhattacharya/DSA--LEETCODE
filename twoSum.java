import java.util.HashMap;

public class twoSum {
    public static void sum(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Pair found at indices: " + map.get(complement) + " and " + i);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found.");
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        sum(arr, target);  // Output should be indices 0 and 1
    }
}
