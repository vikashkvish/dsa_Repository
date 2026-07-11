class Solution {
    public int firstUniqChar(String s) {
        if(s==null || s.length() == 0){
            return -1;
        }
        if(s.length() == 1){
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);

        }
        for(int i = 0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }

        return -1;
    }
}