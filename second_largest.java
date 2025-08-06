class second_largest {
    public static int largestElement(int[] nums) {
        int max = nums[0];
        int sec_largest = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                sec_largest = max;
                max = nums[i];
                found = true;
            } else if (nums[i] < max && nums[i] > sec_largest) {
                sec_largest = nums[i];
                found = true;
            }
        }

        // If all elements were same or no second largest found
        return found ? sec_largest : -1;
    }

    public static void main(String args[]) {
        int[] nums = {10, 10, 10};
        System.out.println(largestElement(nums));  // Output: -1 (no 2nd largest)
    }
}
