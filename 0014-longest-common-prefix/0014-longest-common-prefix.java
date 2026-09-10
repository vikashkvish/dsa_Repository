class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        if(strs==null){
            return str;
        }
        String prefix = strs[0];
        for(int i = 1; i<strs.length; i++){
            String s = strs[i];
            while(!s.startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.length()==0){
                    return "";
                }
            }
        }
        return prefix;
    }
}