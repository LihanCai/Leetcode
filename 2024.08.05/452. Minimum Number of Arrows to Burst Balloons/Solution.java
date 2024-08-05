class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 1;
        int left = points[0][0];
        int right = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= right) {
                if (points[i][1] <= right) {
                    right = points[i][1];
                } else {
                    continue;
                }
            } else {
                count++;
                left = points[i][0];
                right = points[i][1];
            }
        }
        return count;
    }
}
