class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[] directionrows = new int[] { 0, 1, 0, -1 };
        int[] directioncols = new int[] { 1, 0, -1, 0 };

        int[][] ans = new int[rows * cols][2];
        int count = 0;

        ans[count++] = new int[] { rStart, cStart };
        if (rows * cols == 1)
            return ans;

        for (int step = 1; step < 2 * (rows + cols); step += 2) {
            for (int i = 0; i < 4; ++i) {
                int steps = step + (i / 2);
                for (int j = 0; j < steps; ++j) {
                    rStart += directionrows[i];
                    cStart += directioncols[i];
                    if (0 <= rStart && rStart < rows && 0 <= cStart && cStart < cols) {
                        ans[count++] = new int[] { rStart, cStart };
                        if (count == rows * cols)
                            return ans;
                    }
                }
            }
        }
        return null;
    }
}
