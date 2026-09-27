class Solution {
    public int maxSubarray(int[] nums) {
        int n = nums.length;
        int[] freq = new int[501];

        int left = 0;
        int ans = 0;

        for (int right = 0; right < n; right++) {
            freq[nums[right]]++;

            // Shrink until the window is valid
            while (!isValid(freq)) {
                freq[nums[left]]--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

    private boolean isValid(int[] freq) {
        for (int a = 1; a <= 500; a++) {
            if (freq[a] == 0) continue;

            for (int b = a; b <= 500; b++) {
                if (freq[b] == 0) continue;

                int c = a + b;

                if (c > 500 || freq[c] == 0) continue;

                // Need two distinct indices
                if (a == b) {
                    // Need two occurrences of a
                    if (freq[a] >= 2) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}