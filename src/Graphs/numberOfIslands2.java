package Graphs;


import java.util.ArrayList;
import java.util.HashSet;


public class numberOfIslands2 {
    public static void main(String[] args) {
        int[][] grid = {
                {1,1,1,0,0,0},
                {1,1,0,0,0,0},
                {1,0,0,1,1,1},
                {0,0,0,0,0,0},
                {1,1,1,0,1,1},
                {0,0,0,1,1,1}
        };

        System.out.println("Number of distinct islands = " + distinctIslands(grid));
    }

    public static int distinctIslands(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        HashSet<ArrayList<String>> set = new HashSet<>();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == 1 && !visited[i][j]){
                    ArrayList<String> list = new ArrayList<>();
                    dfs(i,j,grid,visited,list,i,j);
                    set.add(list);
                }
            }
        }

        return set.size();
    }

    private static void dfs(int row, int col, int[][] grid, boolean[][] visited, ArrayList<String> list, int row0 , int col0) {
       int n = grid.length;
       int m = grid[0].length;
       visited[row][col] = true;
       list.add(toString(row-row0 , col-col0));

       int[] drow = {-1,0,+1,0};
       int[] dcol = {0,1,0,-1};

        for (int i = 0; i < 4; i++) {
            int nrow = row+ drow[i];
            int ncol = col + dcol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol] == 1 && !visited[nrow][ncol]){
                dfs(nrow,ncol,grid,visited,list,row0,col0);
            }
        }
    }

    private static String toString(int r, int c) {
        return Integer.toString(r) + "," + Integer.toString(c);
    }
}
