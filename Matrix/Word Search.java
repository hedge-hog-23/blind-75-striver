class Solution {
    boolean searchnext(char[][] board, int i, int j, String word, int idx, int m, int n) {
        if (idx == word.length()) 
            return true;
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != word.charAt(idx)) 
            return false;

        char c = board[i][j];
        board[i][j] = '$'; // to prevent reuse of visited chars
        boolean top = searchnext(board, i - 1, j, word, idx + 1, m, n);
        boolean bot = searchnext(board, i + 1, j, word, idx + 1, m, n);
        boolean lef = searchnext(board, i, j - 1, word, idx + 1, m, n);
        boolean rig = searchnext(board, i, j + 1, word, idx + 1, m, n);

        board[i][j] = c;
        return top || bot || lef || rig;
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (searchnext(board, i, j, word, 0, m, n)) 
                        return true;
                }
            }
        }
        return false;
    }
}
