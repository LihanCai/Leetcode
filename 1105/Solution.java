class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int[] f = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            f[i + 1] = Integer.MAX_VALUE;
            int maxH = 0, leftW = shelfWidth;
            for (int j = i; j >= 0; --j) {
                leftW -= books[j][0];
                if (leftW < 0)
                    break;
                maxH = Math.max(maxH, books[j][1]);
                f[i + 1] = Math.min(f[i + 1], f[j] + maxH);
            }
        }
        return f[n];
    }

    public static void main(String[] args) {
        int[][] books = { { 1, 1 }, { 2, 3 }, { 2, 3 }, { 1, 1 }, { 1, 1 }, { 1, 2 } };
        int shelfWidth = 4;
        System.out.println(new Solution().minHeightShelves(books, shelfWidth));
    }
}