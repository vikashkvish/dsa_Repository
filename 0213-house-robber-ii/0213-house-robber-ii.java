class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int skipFirst = totalRob(nums, 1, n - 1);
        int skipLast = totalRob(nums,0, n - 2);
        return Math.max(skipFirst, skipLast);
    }
    private int totalRob(int[] nums, int start, int end){
        int prev1 = 0;
        int prev2 = 0;
        for(int i = start; i<=end; i++){
            int skip = prev1 + nums[i];
            int take = prev2 ;
            int current = Math.max(skip,take);
            prev1 = prev2;
            prev2 = current;
        }
        return prev2;
    }
}