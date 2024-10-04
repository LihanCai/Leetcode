class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set = new HashSet<>();
        for (String ss : dictionary)
            set.add(ss);

        int n = s.length();
        int[] f = new int[n + 1];

        for (int i = 0; i < n; i++) {
            f[i + 1] = f[i] + 1;
            for (int j = 0; j < i + 1; j++) {
                if (set.contains(s.substring(j, i + 1))) {
                    f[i + 1] = Math.min(f[i + 1], f[j]);
                }
            }
        }

        return f[n];

    }
}