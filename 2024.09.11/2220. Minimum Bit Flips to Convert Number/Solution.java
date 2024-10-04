class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int ans = 0;
        while (xor != 0) {
            // If the last bit is 1, increment count
            ans += xor & 1;

            // Right-shift to check the next bit
            xor >>= 1;
        }
        return ans;
    }
}