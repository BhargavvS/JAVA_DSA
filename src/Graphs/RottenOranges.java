package Graphs;

import java.util.LinkedList;
import java.util.Queue;


//BFS ALGORITHM IS USED
public class RottenOranges {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2},
                {0,1,1},
                {2,1,1},
                {1,1,1}
        };

        System.out.println("min time to rotten the givem fresh oranges = " + minTimeRottenOranges(matrix) +" units of time");
    }

    static class pair{
        int row;
        int col;
        int time;

        pair(int r,int c,int t){
            this.row = r;
            this.col = c;
            this.time =t;
        }
    }

    public static int minTimeRottenOranges(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        Queue<pair> q = new LinkedList<>();
        int[][] visited = new int[n][m];
        int cntfresh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if(matrix[i][j] == 2) {
                    q.add(new pair(i, j, 0));
                }
                if(matrix[i][j] == 1) cntfresh++;
                if(matrix[i][j] == 0) visited[i][j] =0;
            }
        }

        int[] drow = {-1,0,+1,0};
        int[] dcol = {0,+1,0,-1};
        int count =0;
        int t=0;

        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int time = q.peek().time;
            q.poll();
            t = time;
            for (int i=0;i<4;i++){
                int nrow = row + drow[i];
                int ncol = col + dcol[i];

                if(nrow >=0 && nrow<n && ncol >=0 && ncol <m && matrix[nrow][ncol] == 1 && visited[nrow][ncol] != 2){
                    q.add(new pair(nrow,ncol,time+1));
                    visited[nrow][ncol] = 2;
                    count++;

                }
            }
        }

        if(cntfresh != count) return -1;
        return t;
    }
}
