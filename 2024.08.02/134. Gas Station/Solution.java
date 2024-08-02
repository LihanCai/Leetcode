class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalgas += gas[i];
            totalcost += cost[i];
        }
        if (totalgas < totalcost)
            return -1;
        int curgas = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            curgas = gas[i] - cost[i];
            if (curgas < 0) {
                index = i + 1;
                curgas = 0;
            }
        }
        return index;
    }
}