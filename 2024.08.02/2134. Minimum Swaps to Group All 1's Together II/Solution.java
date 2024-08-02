class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            count += nums[i];
        }
        if (count == 0 || count == n) return 0;
        int current = 0;
        for(int i = 0; i < count; i++){
            current += nums[i];
        }
        int maxones = current;
        for(int i = 0; i < n; i++){
            current -= nums[i];
            current += nums[(i+count)%n];
            maxones = Math.max(current, maxones);
        }
        return count - maxones;
    }
}