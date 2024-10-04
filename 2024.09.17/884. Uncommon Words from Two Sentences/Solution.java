class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        String[] s1arr = s1.split(" ");
        String[] s2arr = s2.split(" ");
        for (String s : s1arr) {
            hashmap.put(s, hashmap.getOrDefault(s, 0) + 1);
        }
        for (String s : s2arr) {
            hashmap.put(s, hashmap.getOrDefault(s, 0) + 1);
        }
        ArrayList<String> res = new ArrayList<>();
        for (String s : hashmap.keySet())
            if (hashmap.get(s) == 1)
                res.add(s);
        return res.toArray(new String[0]);
    }
}