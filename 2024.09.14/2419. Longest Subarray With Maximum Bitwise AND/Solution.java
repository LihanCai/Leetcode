class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                int j = i;
                while (j < nums.length && nums[j] == max) {
                    ans = Math.max(ans, j - i + 1);
                    j++;
                }
                i = j - 1;
            }

        }
        return ans;
    }
}