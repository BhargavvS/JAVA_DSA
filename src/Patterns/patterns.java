package Patterns;

public class patterns {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(4);
//        pattern3(4);
//        pattern4(4);
        pattern5(4);
    }


    static void pattern1(int n) {
        //* * * *
        //* * * *
        //* * * *
        //* * * *
        for (int row = 1; row <= n ; row++) {
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
        for (int row = 1; row <= n ; row++) {
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

        for (int row = n; row >= 1 ; row--) {
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
        for (int row = 1; row <=n ; row++) {
            // for every row , run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col+ " ");
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

        for (int row = 1; row < n ; row++) {
            for (int col = 1; col <= n -row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
