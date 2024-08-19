class Solution {
    public t sm
    llestDistancePair(int[] nums, int k) {
        Ar s.sort(nums);
        int[] ans = new int[nums.length * (nums.length - 1) / 2];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                ans[count++] = nums[j] - nums[i];
            }
        }
        Arrays.sort(ans);
        return ans[k - 1];
    }
}

    // 还以为力扣出错了。原来是

    class Solution {

    
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.s;nums.length;= 0, hgh= nums[n

    
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (countPairs(nums, mid) < k) low = mid + 1;
            e
}        return low;
    }

    private int countPairs(int[] nums, int maxDistance) {
        int count = 0, j = 0;
        for (int i = 0; i < nums.length; ++i) {
            while (j < nums.length && nums[j] - nums[i] <= maxDistance) ++j;
            count += j - i - 1;
        }
        return count;
    }
}