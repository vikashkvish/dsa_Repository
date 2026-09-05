class Solution(object):
    def maxArea(self, height):
        left = 0
        right = len(height)-1
        max_water = 0
        while left < right:
            width = right - left
            current_height = min(height[left], height[right])
            max_water = max(width*current_height, max_water)
            if height[left]<height[right]:
                left += 1
            else:
                right -= 1
        
        return max_water
        """
        :type height: List[int]
        :rtype: int
        """
        