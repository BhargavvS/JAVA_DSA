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

        int[][] visited = new int[n][m];

        for(int j=0;j<m;j++){
            // row traversal
            if(visited[0][j] == 0 && board[0][j] == 'O'){
                dfs(board,visited,n,m,0,j);
            }


            if(visited[n-1][j] == 0&& board[n-1][j] == 'O'){
                dfs(board,visited,n,m,n-1,j);
            }
        }

        for(int i=0;i<n;i++){

            //column traversal

            if(visited[i][0] == 0 && board[i][0] == 'O'){
                dfs(board,visited,n,m,i,0);
            }

            if(visited[i][m-1] == 0 && board[i][m-1] == 'O'){
                dfs(board,visited,n,m,i,m-1);
            }

        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j] ==0  && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }

    private static void dfs(char[][] board,int[][] visited,int n, int m, int i,int j){
        int[] drow = {-1,0,+1,0};
        int[] dcol = {0,1,0,-1};

        visited[i][j] = 1;

        for(int k=0;k<4;k++){
            int nrow = i + drow[k];
            int ncol = j + dcol[k];

            if(nrow >=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol] ==0 && board[nrow][ncol] == 'O'){
                dfs(board,visited,n,m,nrow,ncol);
            }
        }
    }
}
