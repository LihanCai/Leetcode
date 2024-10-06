public class Solution {
    int[] s1arr = new int[26];
    int[] s2arr = new int[26];

    public boolean checkInclusion(String s1, String s2) {
        // 给定两个字符串，判断s2中是否包含它的任何重组
        // 记录s1的字符串统计情况
        if (s1.length() > s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            s1arr[s1.charAt(i) - 'a']++;
            s2arr[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1arr, s2arr))
                return true;
            s2arr[s2.charAt(i + s1.length()) - 'a']++;
            s2arr[s2.charAt(i) - 'a']--;
        }
        return matches(s1arr, s2arr);
    }

    public boolean matches(int[] s1map, int[] s2arr) {
        for (int i = 0; i < 26; i++) {
            if (s1arr[i] != s2arr[i])
                return false;
        }
        return true;
    }
}