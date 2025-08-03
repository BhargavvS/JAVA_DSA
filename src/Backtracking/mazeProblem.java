package Backtracking;

public class mazeProblem {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,false},
                {true,true,true}
        };
        mazeAllPath("",maze,0,0);
    }
    public static void mazeAllPath(String p,boolean[][] maze,int row,int col){

        if(!maze[row][col]){
            return;
        }

        if(row == maze.length -1 && col == maze[row].length-1){
            System.out.println(p);
            return;
        }

        maze[row][col] = false;

        if(row<maze.length-1){
            mazeAllPath(p+'D',maze,row+1,col);
        }

        if(col < maze[row].length-1){
            mazeAllPath(p+'R',maze,row,col+1);
        }

        if(col>0 && maze[row][col-1]){
            mazeAllPath(p+'L',maze,row,col-1);
        }

        if(row>0 && maze[row-1][col]){
            mazeAllPath(p+'U',maze,row-1,col);
        }

        maze[row][col] = true;
    }
}
