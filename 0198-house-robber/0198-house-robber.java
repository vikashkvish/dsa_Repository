class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(nums==null){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        int[]dp = new int[n+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i<=n; i++){
            int house1 = dp[i - 1];
            int house2 = dp[i-2] + nums[i - 1];
            dp[i] = Math.max(house1, house2);
        }
        return dp[n];
    }
}