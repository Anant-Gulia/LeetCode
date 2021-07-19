class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[board.length][board.length];
        boolean[][] column = new boolean[board.length][board.length];
        boolean[][] box = new boolean[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] != '.') {
                    int val = Character.getNumericValue(board[i][j]) - 1;
                    if(row[i][val] || column[j][val] || box[i / 3 * 3 + j / 3][val])
                        return false;
                    else {
                        row[i][val] = true;
                        column[j][val] = true;
                        box[i / 3 * 3 + j / 3][val] = true;
                    }
                }
            }
        }
        return true;
    }
}

/*
class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] != '.') {
                    if(!set.add(board[i][j] + "row" + i) ||
                       !set.add(board[i][j] + "column" + j) ||
                       !set.add(board[i][j] + "sub-box" + i/3 + j/3))
                        return false;
                }
            }
        }
        return true;
    }
}
*/