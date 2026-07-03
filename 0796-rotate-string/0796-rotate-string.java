class Solution {
    public boolean rotateString(String s, String goal) {
        String s2 = goal + goal;
        if(s2.contains(s)){
            return true;
        }

        return false;
    }
}