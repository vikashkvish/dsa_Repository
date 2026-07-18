class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore);
        Map<Integer, String> map = new HashMap<>();
        int rank = 1;
        for(int i = n - 1; i>= 0; i--){
            if(rank==1){
                map.put(sortedScore[i], "Gold Medal");
            }else if(rank==2){
                map.put(sortedScore[i], "Silver Medal");
            }else if(rank == 3){
                map.put(sortedScore[i], "Bronze Medal");
            }else{
                map.put(sortedScore[i], String.valueOf(rank));
            }
            rank++;
        }
        String [] ans = new String[n];
        for(int i = 0; i<n; i++){
            ans[i] = map.get(score[i]);
        }

        return ans;


    }
}