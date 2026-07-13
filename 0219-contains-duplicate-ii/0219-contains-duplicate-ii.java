class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      if( nums.length <= 1  || k <= 0){
        return false;
      }
      Set<Integer> list = new HashSet<>();
      for(int i = 0; i<nums.length; i++){
        if(list.contains(nums[i])){
            return true;
        }
        list.add(nums[i]);
         if(list.size() > k){
            list.remove(nums[i - k]);

         }
      } 
      return false; 
    }
}