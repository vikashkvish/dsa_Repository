class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean [][] rowTracker = new boolean[9][9];
        boolean [][] colTracker = new boolean[9][9];
        boolean [][] boxTracker = new boolean[9][9];

        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                char currVal = board[row][col];
                if(currVal == '.'){
                    continue;
                }

                int numIndex = currVal - '1';
                int boxIndex = (row/3)*3 + (col/3);
                if(rowTracker[row][numIndex] == true || colTracker[col][numIndex] == true || boxTracker[boxIndex][numIndex] == true){
                    return false;

                }

                rowTracker[row][numIndex]= true;
                colTracker[col][numIndex] = true;
                boxTracker[boxIndex][numIndex] = true;
            }
        }

        return true;
    }
}