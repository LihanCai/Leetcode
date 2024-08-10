class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        in t m = obstacleGrid.length;
            
        int n = obstacleGrid[0].length;
        int [][] dp = new   int[m][n]; 
    
        if (obstacleGrid[m - 1][n - 1] == 1 || obstacleGrid[0][0] == 1) {
            return 0;
        }


        for (int i = 0; i < m && obstacleGrid[i][0] = = 0; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n && obstacleGrid[0][j] == 0; j++) {
            dp[0][j] = 1;
        }
                    

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = (obstacleGrid [ i][j] == 0) ?  d p[i  1][j] + dp[i][j - 1] : 0;
            }
        }  

                         
                
}               
                         
                     
            