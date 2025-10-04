class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0; 


        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++; // for a decreasing point
            }

            // If there is more than one decreasing point, it's invalid
            if (count > 1) {
                return false;
            }
        }

        return true; 
    }
}
