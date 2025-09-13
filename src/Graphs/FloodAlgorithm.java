package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

import static Graphs.dfsTraversal.dfs;

public class FloodAlgorithm {
    public static void main(String[] args) {
            int[][] matrix = {
                    {1,1,1},
                    {2,2,3},
                    {1,1,0},
                    {1,1,1}
            };

    int sr = 3;
    int sc = 0;
    int newColour = 2;
    flood(matrix,sr,sc,newColour);
    System.out.println("after flooding with : " + newColour);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void flood(int[][] matrix , int sr, int sc, int newColour){
        int rowLen = matrix.length;
        int colLen = matrix[rowLen-1].length;

        boolean[][] visited = new boolean[rowLen][colLen];
        int initialColour = matrix[sr][sc];

        dfs(matrix,sr,sc,visited,newColour,initialColour);
    }

    private static void dfs(int[][] matrix, int i, int j, boolean[][] visited, int newColour, int initialColour) {
        visited[i][j] = true;
        matrix[i][j] = newColour;
        if(i>0){
            if(matrix[i-1][j] == initialColour && !visited[i-1][j]){
                dfs(matrix,i-1,j,visited,newColour,initialColour);
            }
        }

        if(i<matrix.length-1)  {
            if (matrix[i + 1][j] == initialColour && !visited[i + 1][j]) {
                dfs(matrix, i + 1, j, visited,newColour,initialColour);
            }
        }

        if(j>0){
            if(matrix[i][j-1] == initialColour && !visited[i][j-1]){
                dfs(matrix,i,j-1,visited,newColour,initialColour);
            }
        }

        if(j<matrix[i].length-1){
            if (matrix[i][j + 1] == initialColour && !visited[i][j + 1]) {
                dfs(matrix, i, j + 1, visited,newColour,initialColour);
            }

        }
    }
}
