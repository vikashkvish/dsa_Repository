class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       List<Integer> missing = new ArrayList<>();
        if (nums == null || nums.length == 0) return missing;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> numSet = new HashSet<>();

        // Find the min, max, and populate the set
        for (int num : nums) {
            numSet.add(num);
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Iterate through the original range and find missing integers
        for (int i = min + 1; i < max; i++) {
            if (!numSet.contains(i)) {
                missing.add(i);
            }
        }

        return missing;
    }
}