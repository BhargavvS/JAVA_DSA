package Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        System.out.println(Nqueens(board,0));
    }

    public static int Nqueens(boolean[][] board, int row){
        if(row == board.length-1){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        // HERE WE ARE PLACING THE QUEEN AND CHECK WHETHER IT IS SAFE
        for (int col=0;col<board[row].length-1;col++)
        {
            if(isSafe(board,row,col)){board[row][col] = true;
             count +=   Nqueens(board,row+1);
             board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // checking the vertical col
        for (int i = 0; i < row; i++) {
            if(board[row-i][col]) return false;
        }

        // check to ur the right diagonal
        int maxRight = Math.min(row,board.length - col -1);

        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) return false;
        }


        // check for the left diagonal
        int maxLeft = Math.min(row,col);

        for (int i = 1; i <= maxLeft ; i++) {
            if(board[row-i][col-i]) return false;
        }

        return true;

    }

    public static void display(boolean[][] board){
        for (boolean[] row:board){
            for (boolean element:row){
                if(element){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
