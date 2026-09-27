class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        int base = 0;

        // Count mixed adjacent pairs
        Map<Long, Integer> count = new HashMap<>();

        for (int i = 1; i < nums.length; i++) {

            int a = nums[i - 1];
            int b = nums[i];

            if (a == b) {
                base++;
            } else {
                // Store pair in a fixed order
                int min = Math.min(a, b);
                int max = Math.max(a, b);

                long key = ((long) min << 32) | (max & 0xffffffffL);

                count.put(key, count.getOrDefault(key, 0) + 1);
            }
        }

        int bestGain = 0;

        for (int freq : count.values()) {
            bestGain = Math.max(bestGain, freq);
        }

        return base + bestGain;
        
    }
}