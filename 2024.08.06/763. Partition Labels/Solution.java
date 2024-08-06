class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new L inkedList<>();
        int[] edge = new int[26];
        cha r[] chars = S.toCharArray(); 
        for (i nt i = 0; i < chars.length; i++ )  { 
            edge[chars[i] - 'a'] = i;
        } idx  = 0;
        int last = -1;  
        for (int i = 0; i < chars.length; i++) {
            idx = Math.max(idx,edge[chars[i] - 'a']);
            if (i == idx) {
                list.add(i - last);
                last = i;
            }
        }
        return list;
    }
}