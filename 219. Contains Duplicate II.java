class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Arrays.sort(nums);
        int result;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
                if (nums[i] == nums[j]) {
                    result = Math.abs(i - j);
                    if (result == k) {
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
