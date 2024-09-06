class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ans = new int[n];
        int m = rolls.length;
        int total = (n + m) * mean;
        for(int roll : rolls){
            total -= roll;
        }
        double avg = (double) total / n;
        int rest = total % n;
        if(avg > 6 || avg < 1) return new int[0];
        if(rest == 0){
            Arrays.fill(ans, total / n);
        }
        else{
            int base = total / n;
            int index = 0;
            while(rest > 0){
                ans[index++] = base + 1;
                rest--;
            }
            for(int i = index; i < n; i++){
                ans[i] = base;
            }
        }
        return ans;
    }
}