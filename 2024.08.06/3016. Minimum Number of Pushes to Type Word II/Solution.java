class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        char[] ch = word.toCharArray();
        int[] record = new int[26];
        for(char letter : ch){
            record[letter-'a']++;
        }
        Integer[] sortedFreq = new Integer[26];
        for (int i = 0; i < 26; i++) {
            sortedFreq[i] = record[i];
        }
        Arrays.sort(sortedFreq, (a, b) -> b - a);
        int ans = 0;
        for(int i = 0; i < 26; i++){
            if(sortedFreq[i] == 0) break;
            ans += sortedFreq[i] * (1+(i/8));
        }
        return ans;
    }
}