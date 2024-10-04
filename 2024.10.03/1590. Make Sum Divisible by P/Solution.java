class Solution {
    public int minSubarray(int[] nums, int p) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int sum = 0;
        int cur = 0;
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % p;
        }
        if (sum == 0)
            return 0;
        hashmap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            cur = (cur + nums[i]) % p;
            hashmap.put(cur, i);
            int want = (cur - sum + p) % p;
            ans = Math.min(ans, i - hashmap.getOrDefault(want, -nums.length));
        }
        if (ans == nums.length)
            return -1;
        return ans;
    }
}