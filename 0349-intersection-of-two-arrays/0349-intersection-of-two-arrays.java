class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       if(nums1.length <= 0 || nums2.length <= 0){
         return new int[]{};
       }
       Set<Integer> set = new HashSet<>();
       Set<Integer> list = new HashSet<>();
       for(int i = 0; i<nums1.length; i++){
         set.add(nums1[i]);
       }

       for(int i = 0; i<nums2.length; i++){
          if(set.contains(nums2[i])){
            list.add(nums2[i]);
          }
       }

       int[] result = list.stream().mapToInt(Integer::intValue).toArray();

       return result;

    }
}