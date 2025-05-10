package Patterns;

public class patterns {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(4);
//        pattern3(4);
//        pattern4(4);
//        pattern5(4);
//        pattern28(5);
//        pattern30(4);
//        pattern17(4);
          pattern31(4);

    }


    static void pattern1(int n) {
        //* * * *
        //* * * *
        //* * * *
        //* * * *
        for (int row = 1; row <= n; row++) {
            // for every row , run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        //*
        //* *
        //* * *
        //* * * *
        for (int row = 1; row <= n; row++) {
            // for every row , run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        //* * * *
        //* * *
        //* *
        //*

        for (int row = n; row >= 1; row--) {
            // for every row , run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
//        1
//        1 2
//        1 2 3
//        1 2 3 4
        for (int row = 1; row <= n; row++) {
            // for every row , run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        //*
        //* *
        //* * *
        //* * * *
        //* * *
        //* *
        //*
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 1; row < n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {

//           1
//          212
//         32123
//        4321234
//         32123
//          212
//           1

        for (int row = 1; row <= n * 2 -1 ; row++) {

            int totalcol = row > n ? 2 * n - row : row;
            int totalspaces = row > n ? row - n : n - row;

            for (int spaces = 1; spaces <= totalspaces; spaces++) {
                System.out.print(" ");
            }

            if (row > n) {
                for (int col = 2 * n - row; col >= 1; col--) {
                    System.out.print(col);
                }
                for (int col = 2; col <= totalcol; col++) {
                    System.out.print(col);
                }
            }else {
                for (int col = row; col >= 1; col--) {
                    System.out.print(col);
                }
                for (int col = 2; col <= totalcol; col++) {
                    System.out.print(col);
                }
            }



                System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row < 2 * n - 1; row++) {
            int totalcol = row > n ? 2 * n - row : row;
            int totalspaces = n - totalcol;

            for (int spaces = 1; spaces <= totalspaces; spaces++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalcol; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    static void pattern30(int n) {

//              1
//            2 1 2
//          3 2 1 2 3
//        4 3 2 1 2 3 4
        for (int row = 1; row <= n; row++) {

            int totalspaces = n - row;

            for (int spaces = 1; spaces <= totalspaces; spaces++) {
                System.out.print("  ");
            }

            for (int col = row; col>=1; col--) {
                System.out.print(col+" ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }

            System.out.println();
        }

    }

    static  void pattern31(int n) {
        int originalN = n;
        n = 2*n -2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int value = originalN - Math.min(Math.min(row,col) , Math.min(n-row,n-col));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
