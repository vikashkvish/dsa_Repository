class Solution {
    public int firstMissingPositive(int[] nums) {
       int n = nums.length;
       for(int i = 0; i<n; i++ ){
        //nums[i] > 0 to avoid negative index
        //nums[i] <= n avoid IndexOutOfBound
        //nums[nums[i] - 1] != nums[i] avoid duplicate value
        while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i] ){
            int tempInd = nums[i] - 1;
            int temp = nums[tempInd];
            nums[tempInd] = nums[i];
            nums[i] = temp;
        }
        
       } 

       for(int i = 0; i<n; i++){
        if(nums[i] != i + 1){
            return i+1;
        }
       }
       return n + 1;
    }
}