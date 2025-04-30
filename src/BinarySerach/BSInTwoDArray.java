package BinarySerach;

public class BSInTwoDArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        System.out.println(matrix.length);
       boolean valid =  searchMatrix(matrix,target);
        System.out.println(valid);
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int start , end;
        boolean index = false;

        if(matrix.length == 1) {
         return BS(matrix, 0, matrix[0].length-1, target);
        }
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                start = i;
                end = matrix[i].length - 1;
                index = BS(matrix, start, end, target);
                if (index) {
                    return index;
                }
            }
        }
        return index;

    }

   static boolean BS(int[][] matrix, int start, int end, int target) {
//        int i= start;
//
//        if(start > end) {
//            if(matrix[start][end] == target) return true;
//        }
//        while(start <= end) {
//            int mid = start + (end - start) /2;
//            if(target < matrix[i][mid]) end = mid-1;
//            else if(target > matrix[i][mid]) start = mid+1;
//            else return true;
//        }
//
//        return false;
       int i = 0;
       int j = end;
       if (start > end) {
           if (matrix[start][end] == target) return true;
       }
       while (i <= j) {
           int mid = i + (j - i) / 2;
           if (target < matrix[start][mid]) j = mid - 1;
           else if (target > matrix[start][mid]) i = mid + 1;
           else return true;
       }
       return false;
   }
}
