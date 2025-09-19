package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class pair{
    int row;
    int col;
    int dis;

    pair(int row,int col,int dis){
        this.row = row;
        this.col = col;
        this.dis = dis;
    }
}

public class NearestCell {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,0,0},
                {0,1,0},
                {1,0,1}
        };

//        int[][] distance = distanceTo1(matrix);
        int[][] distance = distanceTo0(matrix);

        for (int i = 0; i < distance.length; i++) {
            for (int j = 0; j < distance[0].length; j++) {
                System.out.print(distance[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static  int[][] distanceTo1(int[][] matrix){
        int n= matrix.length;
        int m = matrix[0].length;

        int[][] visited = new int[n][m];
        int[][] distance = new int[n][m];

        Queue<pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 1){
                    q.add(new pair(i,j,0));
                    visited[i][j] = 1;
                }
            }
        }

        int[] dx = {-1,0,+1,0};
        int[] dy = {0,+1,0,-1};

        while (!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int dis = q.peek().dis;

            q.poll();

            distance[row][col] = dis;
            visited[row][col] = 1;

            for (int i=0;i<4;i++){
                int nrow = row+dx[i];
                int ncol = col+ dy[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && (visited[nrow][ncol] == 0)){
                    q.add(new pair(nrow,ncol,dis+1));
                }
            }
        }

        return distance;
    }

    public static  int[][] distanceTo0(int[][] matrix){
        int n= matrix.length;
        int m = matrix[0].length;

        int[][] visited = new int[n][m];
        int[][] distance = new int[n][m];

        Queue<pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 0){
                    q.add(new pair(i,j,0));
                    visited[i][j] = 1;
                }
            }
        }

        int[] dx = {-1,0,+1,0};
        int[] dy = {0,+1,0,-1};

        while (!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int dis = q.peek().dis;

            q.poll();

            distance[row][col] = dis;
            visited[row][col] = 1;

            for (int i=0;i<4;i++){
                int nrow = row+dx[i];
                int ncol = col+ dy[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && (visited[nrow][ncol] == 0)){
                    q.add(new pair(nrow,ncol,dis+1));
                }
            }
        }

        return distance;
    }
}
