package Backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        System.out.println(NKnightsCount(board,0));
    }

    public static int NKnightsCount(boolean[][] board,int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        // HERE WE ARE PLACING THE Knights AND CHECK WHETHER IT IS SAFE
        for (int col=0;col<board[row].length;col++)
        {
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += NKnightsCount(board,row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    public static void display(boolean[][] board){
        for (boolean[] row:board){
            for (boolean element:row){
                if(element){
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // checking the vertical col
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]) return false;
        }

        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]) return false;
        }

        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]) return false;
        }

        if(isValid(board,row+1,col-2)){
            if(board[row+1][col-2]) return false;
        }

        return true;

    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        if(row>0 && row<= board.length-1 && col>0 && col<= board.length-1) return true;
        else return false;
    }
}
