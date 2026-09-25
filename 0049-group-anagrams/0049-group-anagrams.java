class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Use Map it will fetch exact List with Key to add respective anagram
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            //To check anagram key
            char[] c = s.toCharArray();
            Arrays.sort(c);
            //Array to String
            String key = new String(c);
            //Create new List if key is not present in List
            map.putIfAbsent(key, new ArrayList<>());
            //Search List with key and add original string s
            map.get(key).add(s);

        }
        //Return all values of Map in new ArrayList
        return new ArrayList(map.values());
        
    }
}