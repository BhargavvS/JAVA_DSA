package Graphs;

import static Graphs.dfsTraversal.dfs;

public class WordSearch {
    public static void main(String[] args) {
//        char[][] matrix = {
//                {'A', 'B', 'C', 'E'},
//                {'S', 'F', 'C', 'S'},
//                {'A', 'D', 'E', 'E'}
//        };

        char[][] matrix = {
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'}
        };

        String word = "AAB";
        System.out.println(isWordExist(matrix,word));
    }

    public static boolean isWordExist(char[][] matrix,String word){
        int rowLen = matrix.length;
        int colLen = matrix[rowLen-1].length;

        boolean[][] visited = new boolean[rowLen][colLen];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == word.charAt(0)){
                    boolean valid = dfs(matrix,i,j,1,visited,word);
                    if(valid) return true;
                }else continue;;
            }
        }

        return false;
    }

    private static boolean dfs(char[][] matrix, int i, int j, int k, boolean[][] visited, String word) {
        if (k == word.length()) return true;

        visited[i][j] = true;

        // 4 directions: up, down, left, right
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int d = 0; d < 4; d++) {
            int newI = i + dx[d];
            int newJ = j + dy[d];

            if (newI >= 0 && newI < matrix.length &&
                    newJ >= 0 && newJ < matrix[0].length &&
                    !visited[newI][newJ] &&
                    matrix[newI][newJ] == word.charAt(k))
            {
                boolean valid = dfs(matrix, newI, newJ, k + 1, visited, word);
                if (valid) return true;  // short-circuit if found
            }
        }
        visited[i][j] = false;
        return false;
    }
}
