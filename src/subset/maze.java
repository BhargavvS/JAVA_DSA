package subset;

import javax.sql.rowset.serial.SerialStruct;

public class maze {
    public static void main(String[] args) {
//        System.out.println(maze2Count(4,4));
        mazePrint("",4,4);
    }


    public static int mazeCount(int r, int c){
        // this is for a 3X3 matrix

        if(r == 2 || c == 2) return 1;

        int left = mazeCount(r+1,c);
        int right = mazeCount(r,c+1);
        return left+right;
    }

    public static int maze2Count(int r, int c){
        // this is for a custom matrix

        if(r ==  1|| c == 1) return 1;

        int left = maze2Count(r-1,c);
        int right = maze2Count(r,c-1);
        return left+right;
    }

    public static void mazePrint(String p ,int r, int c){
        // this is for a custom matrix

        if(r ==  1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r>1){
            mazePrint(p+'D',r-1,c);

        }

        if(c>1) {
            mazePrint(p + 'R', r, c - 1);
        }

    }

    public static void mazeList(String p ,int r, int c){
        // this is for a custom matrix

        if(r ==  1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r>1){
            mazeList(p+'D',r-1,c);

        }

        if(c>1) {
            mazeList(p + 'R', r, c - 1);
        }

    }


}
