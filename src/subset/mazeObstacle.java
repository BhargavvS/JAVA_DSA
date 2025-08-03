package subset;

public class mazeObstacle {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,false},
                {true,true,true}
        };
        mazeWithObstacle("",board,0,0);
    }

    public static void mazeWithObstacle(String p,boolean[][] board, int row, int col){
        if(!board[row][col]){
            return;
        }

        if(row == board.length -1 && col == board[row].length-1){
            System.out.println(p);
            return;
        }

        if(row<board.length-1){
            mazeWithObstacle(p+'D',board,row+1,col);
        }

        if(col < board[row].length-1){
            mazeWithObstacle(p+'R',board,row,col+1);
        }
    }


}
