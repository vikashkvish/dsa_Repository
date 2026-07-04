class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();

       for(String s: strs){
         char[] chars = s.toCharArray();
         Arrays.sort(chars);
         String sortedStr = new String(chars);

         if(!map.containsKey(sortedStr)){
            //map stores sorted array as key and groupAnagrams as values
            map.put(sortedStr, new ArrayList<>());
         }
         //values stored with sorted key
         map.get(sortedStr).add(s);
       } 
       //return as list of values with sorted key
       return new ArrayList<>(map.values());
    }
}