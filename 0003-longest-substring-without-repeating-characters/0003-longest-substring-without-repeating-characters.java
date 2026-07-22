class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] indexMap = new int[128]; 
        int maxCount = 0;
        
        for (int left = 0, right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            
            // If we've seen this character before, instantly jump the left pointer 
            // to the right of the previous occurrence (avoiding a slow while loop).
            // We use Math.max to ensure the left pointer never moves backward.
            left = Math.max(left, indexMap[ch]);
            
            // Calculate the current window size
            maxCount = Math.max(maxCount, right - left + 1);
            
            // Store the NEXT index of this character so the left pointer 
            // knows exactly where to jump if we see it again.
            indexMap[ch] = right + 1;
        }
        
        return maxCount;
    }
}