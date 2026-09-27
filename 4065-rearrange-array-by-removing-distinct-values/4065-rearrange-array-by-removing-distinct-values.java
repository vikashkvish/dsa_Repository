class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] freq = new int[101];

        // Count frequency
        for (int num : nums) {
            freq[num]++;
        }

        int[] ans = new int[nums.length];
        int index = 0;

        // Keep performing rounds
        while (index < nums.length) {

            for (int num = 1; num <= 100; num++) {

                if (freq[num] > 0) {
                    ans[index++] = num;
                    freq[num]--;
                }
            }
        }

        return ans;
    }
}