package Graphs;

import static Graphs.dfsTraversal.dfs;

public class NumberOfIslands {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,1,1,1,1},
                {1,1,0,0,0,0},
                {0,1,0,1,1,1},
                {1,0,0,1,1,1},
                {0,1,0,0,0,0},
                {0,0,0,1,1,1}
        };

//        int row = matrix.length;
//        int col = matrix[row-1].length;
//        System.out.println(row + "," + col);

        System.out.println(Islands(matrix));
    }

    public static int Islands(int[][] matrix){
        int rowLen = matrix.length;
        int colLen = matrix[rowLen-1].length;
        boolean[][] visited = new boolean[rowLen][colLen];
        int count =0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]== 1 && !visited[i][j]){
                    count++;
                    dfs(matrix,i,j,visited);
                } else continue;
            }
        }

        return count;
    }

    private static void dfs(int[][] matrix,int i, int j, boolean[][] visited){
        visited[i][j] = true;

        if(i>0){
            if(matrix[i-1][j] == 1 && !visited[i-1][j]){
                dfs(matrix,i-1,j,visited);
            }
        }

      if(i<matrix.length-1)  {
            if (matrix[i + 1][j] == 1 && !visited[i + 1][j]) {
                dfs(matrix, i + 1, j, visited);
            }
        }

        if(j>0){
            if(matrix[i][j-1] == 1 && !visited[i][j-1]){
                dfs(matrix,i,j-1,visited);
            }
        }

        if(j<matrix[i].length-1){
            if (matrix[i][j + 1] == 1 && !visited[i][j + 1]) {
                dfs(matrix, i, j + 1, visited);
            }

        }
    }
}
