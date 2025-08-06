public class SORTED_ROTATED {

    // LOGIC: BREAK=0(SORTED ARRAY) BREAK=1(SORTED AND ROATAED) BREAK>1(INVALID)
   
        public static boolean check(int[] nums) {
            int n = nums.length;
            int breakCount = 0;  // Count where order breaks

            for (int i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    breakCount++;
                }
            }

            // Circular check: last element vs first
            if (nums[n - 1] > nums[0]) {
                breakCount++;
            }

            return breakCount <= 1;
        }
    

    // Main method to test your logic
   
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 2, 3};  // Test array

        // ✅ Directly call the static method
        boolean result = check(nums);

        System.out.println("Is array sorted and rotated? " + result);
    }
}
