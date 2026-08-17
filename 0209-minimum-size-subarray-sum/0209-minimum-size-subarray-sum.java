class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int minLen = Integer.MAX_VALUE;
       int currSum = 0;
       int left = 0;
       for(int i = 0; i<nums.length; i++){
          currSum += nums[i];
          while(currSum >= target){
             minLen = Math.min(minLen, i - left + 1);
             currSum -= nums[left++];

          }
       } 
       if(minLen == Integer.MAX_VALUE){
          minLen = 0;
       }

       return minLen;
    }
}