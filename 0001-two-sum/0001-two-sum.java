class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> result = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int num = target - nums[i];
            if(result.containsKey(num)){
                return new int[]{result.get(num),i};
            }else{
                result.put(nums[i], i);
            }
        }

        return new int[]{};
        
    }
}