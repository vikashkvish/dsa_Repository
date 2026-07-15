
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Step 1: Sort the array to group duplicates
        Arrays.sort(nums); 
        
        // Step 2: Start backtracking
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        // Base case: If the current permutation length equals the array length, we have a valid permutation
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip elements that are already in the current permutation path
            if (used[i]) continue;
            
            // Step 3: Prune duplicate branches
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            // Choose
            used[i] = true;
            tempList.add(nums[i]);
            
            // Explore
            backtrack(result, tempList, nums, used);
            
            // Un-choose (Backtrack)
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}