class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums2.length > nums1.length){
            return intersect(nums2, nums1);
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i  = 0; i<nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                list.add(nums2[i]);
                map.put(nums2[i], map.getOrDefault(nums2[i], 0) - 1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}