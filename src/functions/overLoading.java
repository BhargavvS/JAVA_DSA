package functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class overLoading {
    public static void main(String[] args) {
        // overloading means : same function name and different no of parameters and their type
//        System.out.println(sum(2, 3));
//        System.out.println(sum(2 , 3, 4));

       

    }

    static int sum(int a , int b) {
        return  a + b;
    }

    static int sum(int a , int b , int c) {
        return a+b+c;
    }
}
