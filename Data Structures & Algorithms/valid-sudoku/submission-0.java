class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();
        for(int i=0; i<board.length ; i++){
            for(int j=0; j<board[0].length ; j++){
                char current = board[i][j];
                if(current!='.'){
                    if(!seen.add(current + "at row" + i) ||
                        !seen.add(current+"at col"+j) ||
                        !seen.add(current+"at box"+i/3+"-"+j/3)){
                            return false;
                        }
                }
            }

        }

        return true;
    }
}
