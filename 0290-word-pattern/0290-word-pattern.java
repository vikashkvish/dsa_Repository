class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern.length() != str.length){
            return false;
        }
        Map<Character, String> pat = new HashMap<>();
        Map<String, Character> st = new HashMap<>();

        for(int i = 0; i<pattern.length(); i++){
           String word = str[i];
           char c = pattern.charAt(i);

           if(pat.containsKey(c)){
             if(!pat.get(c).equals(word)){
                return false;
             }
           }else {
             pat.put(c,word);
           } 

           if(st.containsKey(word)){
             if(!st.get(word).equals(c)){
                return false;
             }
           }else{
             st.put(word, c);
           } 
        }

        return true;

    }
}