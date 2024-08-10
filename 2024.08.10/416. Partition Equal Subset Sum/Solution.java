class Solution {
    public boolean canPartition(int[] nums) {
        in t len = nums.length;
            
        if(len == 0) return false;
        int  sum = 0;   
        for(int  num : nums){   
            sum +=  num;
                    
        }
        if(sum %2 == 1) return false;
        int target = sum / 2;
     

        for(int j = nums[0]; j <= target; j++){ 
            dp[0][j] = nums[0];
        }
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j <= target; j++){
                if(nums[i] > j) dp[i][j] = dp[i-1][j];
                    
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-nums[i]] + nums[i]);
                }
            }     
        }
        ret urn dp[len-1][target] = =

                         
                               
                         
                     
            