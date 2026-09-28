class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cookieSize = 0;
        int count = 0;
        while(child < g.length && cookieSize < s.length){
            if(s[cookieSize] >= g[child]){
                count++;
                child++;
                cookieSize++;
            }else{
                cookieSize++;
            }
        }
        return count;
    }
}