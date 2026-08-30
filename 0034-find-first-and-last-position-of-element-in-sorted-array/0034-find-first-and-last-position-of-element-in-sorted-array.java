class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int second = findSecond(nums, target);

        return new int[]{first,second};
        
    }

    private static int findFirst(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        int mid = 0;
        while(left <= right){
            mid = left + (right - left)/2;
            if(nums[mid] == target){
                ans = mid;
                right = mid - 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }

    private static int findSecond(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        int mid = 0;
        while(left <= right){
            mid = left + (right - left)/2;
            if(nums[mid] == target){
                ans = mid;
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}