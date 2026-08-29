class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {

                if (nums[left] <= target && target < nums[mid]) {
                    // Search left
                    right = mid - 1;
                } else {
                    // Search right
                    left = mid + 1;
                }

            } else {

                // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    // Search right
                    left = mid + 1;
                } else {
                    // Search left
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}