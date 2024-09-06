class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(Integer.toString(s.charAt(i) - 'a' + 1));
        }
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans = 0;
            for (int j = 0; j < sb.length(); j++) {
                ans += sb.charAt(j) - '0';
            }
            sb.delete(0, sb.length());
            sb.append(Integer.toString(ans));
        }
        return ans;
    }
}