class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] index = new int[n];
        for(int[] road : roads){
            index[road[0]]++;
            index[road[1]]++;
        }
        Arrays.sort(index);
        long ans = 0;
        for(int i = n-1; i >= 0; i--){
            ans += (long)(i+1)*index[i];
        }
        return ans;
    }
}