class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence2.length() < sentence1.length()) return areSentencesSimilar(sentence2, sentence1);
        
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");

        int left = 0;
        int right = 0;
        
        while(left < s1.length && s1[left].equals(s2[left])){
            left++;
        }
        while(right < s1.length && s1[s1.length - 1 - right].equals(s2[s2.length - 1 - right])){
            right++;
        }
        return left + right >= s1.length;
    }
}