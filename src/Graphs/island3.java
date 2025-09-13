package Graphs;

public class island3 {
    public static void main(String[] args) {
        int[][] grid = {
                {1,1,1,0,0,0},
                {1,1,0,0,0,0},
                {1,0,0,1,1,1},
                {0,0,0,0,0,0},
                {1,1,1,0,1,1},
                {0,0,0,1,1,1}
        };

        System.out.println(maxAreaOfIsland(grid));
    }

    public static int maxAreaOfIsland(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[rowLen-1].length;
        boolean[][] visited = new boolean[rowLen][colLen];
        int count =0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]== 1 && !visited[i][j]){
                    int val = dfs(matrix,i,j,visited,0);
                    count = Math.max(count,val);
                } else continue;
            }
        }

        return count+1;
    }

    private static int dfs(int[][] matrix,int row, int col, boolean[][] visited,int count){
        int n = matrix.length;
        int m = matrix[0].length;
        visited[row][col] = true;
        int[] drow = {-1,0,+1,0};
        int[] dcol = {0,1,0,-1};
        int area = 1;
        for (int i = 0; i < 4; i++) {
            int nrow = row+ drow[i];
            int ncol = col + dcol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && matrix[nrow][ncol] == 1 && !visited[nrow][ncol]){
               area += dfs(matrix,nrow,ncol,visited,count+1);
            }
        }

        return area;

    }
}
