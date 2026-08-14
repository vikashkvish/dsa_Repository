class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int value : nums2){
            while(!stack.isEmpty() && value > stack.peek()){
                nextGreater.put(stack.pop(), value);
            }
            stack.push(value);
        }

        while (!stack.isEmpty()){
            nextGreater.put(stack.pop(), - 1);
        }

        int[] ans = new int[nums1.length];

        for(int i = 0; i<nums1.length; i++){
            ans[i] = nextGreater.get(nums1[i]);
        }
        return ans;
    }
}