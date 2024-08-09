class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        if(grid.length < 3 || grid[0].length < 3) return 0;
        int ans = 0;
        for(int r = 0; r+3 <= grid.length; r++){
            for(int c = 0; c+3 <= grid[0].length; c++){
                if(check(grid, r, c)) ans++;
            }
        }
        return ans;
    }
    private boolean check(int[][] grid, int i, int j){
        int[] seen = new int[10];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                int num = grid[i + x][j + y];
                if (num < 1 || num > 9 || seen[num] == 1) return false;
                seen[num]++;
            }
        }
        int sum = grid[i][j] + grid[i][j+1] + grid[i][j+2];  // First row sum
        int count = 0;
        for(int x = 0; x < 3; x++){
            
            if(sum != grid[x+i][j] + grid[x+i][j+1]+grid[x+i][j+2]) return false;
        }
        for(int y = 0; y < 3; y++){
            if(sum != grid[i][j+y] + grid[i+1][j+y]+grid[i+2][j+y]) return false;
        }
        if(sum != grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2]) return false;
        if(sum != grid[i+2][j] + grid[i+1][j+1] + grid[i][j+2]) return false;
        return true;
    }
}
