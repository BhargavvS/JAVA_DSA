package Leetcode;

public class SurroundedRegoins {
    public static void main(String[] args) {
        char[][] board =
                {
                        {'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'},{'X','X','O','X'}, {'X', 'O', 'X', 'X'}
                };

        solve(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        // char[][] result = board;
        boolean[][] visited = new boolean[n][m];

        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(board[i][j] == 'O' && !visited[i][j] && isSafe(board,i,j,visited)){
                        dfs(board, visited, i, j);
                }
            }
        }
    }

    private static  void dfs(char[][] board,boolean[][] visited,int i,int j){
        int n = board.length;
        int m = board[0].length;

        int[] drow = {+1,0,-1,0};
        int[] dcol = {0,+1,0,-1};

        visited[i][j] = true;
        board[i][j] = 'X';

        for(int k=0;k<4;k++){
            int nrow = i+drow[k];
            int ncol = j + dcol[k];

            if(nrow>0 && nrow<n && ncol>0 && ncol<m  && board[i][j] == 'O'){
                dfs(board,visited,nrow,ncol);
            }
        }

        return;
    }

    private static boolean isSafe(char[][] board, int i ,int j,boolean[][] visited) {
        int n = board.length;
        int m = board[0].length;

        // If cell is at the border and is 'O', it’s NOT safe
        if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
            return false;
        }


        visited[i][j] = true;
        int[] drow = {+1, 0, -1, 0};
        int[] dcol = {0, +1, 0, -1};

        for (int k = 0; k < 4; k++) {
            int ni = i + drow[k];
            int nj = j + dcol[k];

            if (ni >= 0 && ni < n && nj >= 0 && nj < m && board[ni][nj] == 'O' && !visited[ni][nj]) {
                if (!isSafe(board, ni, nj, visited)) {
                    return false; // If neighbor connects to border, cell is NOT safe
                }
            }
        }

        return true; // No path to border found
    }
}
