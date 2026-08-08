class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int count = 0;
        for(int i = 0; i<m; i++){
            // int left = 0;
            // int right = grid[i].length;
            // while(left<right){
            //     int mid = left + (right - left)/2;
            //     if(grid[i][mid] > 0){
            //         left = mid + 1;
            //     }else{

            //     }
            // }
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}