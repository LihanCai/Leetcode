class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = words.length;
        int[] allowedcount = new int[26];
        for (int i = 0; i < allowed.length(); i++) {
            allowedcount[allowed.charAt(i) - 'a']++;
        }

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (allowedcount[word.charAt(i) - 'a'] <= 0) {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}