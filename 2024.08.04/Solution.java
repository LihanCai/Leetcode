class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] arr = new int[(n+1)*n/2];
        int count = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j + i < n; j++){
                sum += nums[i+j];
                arr[count++] = sum;
            }
        }
        Arrays.sort(arr);
        final int mod = (int) 1e9 + 7;
        for(int i = left-1; i < right; i++){
            ans = (ans + arr[i]) % mod;;
        }
        return ans;
    }
}