class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //Sort array to arrange
        Arrays.sort(nums);
        //lets assume first 3 element is closest
        int closestSum = nums[0] + nums[1] + nums[2];

        //iterate 0 to n-2
        for(int i = 0; i<nums.length - 2; i++){
            //if equal element sum will be same so skip
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            //two pointers
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                //first element iterate one by one
                int currentSum = nums[i] + nums[left] + nums[right];

                //if target sum target found no need to iterate, return
                if(currentSum == target){
                    return currentSum;
                }
                //least difference will show closest sum
                if(Math.abs(currentSum - target) < Math.abs(closestSum - target)){
                    closestSum = currentSum;
                }

                //two pointers save time
                if(currentSum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closestSum;
        
    }
}