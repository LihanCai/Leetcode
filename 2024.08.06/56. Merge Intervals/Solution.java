class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int last = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= last) {
                // start = Math.min(start, intervals[i][0])
                last = Math.max(last, intervals[i][1]);
            } else {
                ans.add(Arrays.asList(start, last));
                start = intervals[i][0];
                last = intervals[i][1];
            }
        }
        ans.add(Arrays.asList(start, last));
        int[][] res = new int[ans.size()][2];
        // System.out.print(ans.get(0).getClass().getName().toString());
        for (int i = 0; i < ans.size(); i++) {
            res[i][0] = ans.get(i).get(0);
            res[i][1] = ans.get(i).get(1);
        }
        return res;
    }
}