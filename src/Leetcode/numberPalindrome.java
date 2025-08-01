package Leetcode;

import java.util.Stack;

public class numberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
//        System.out.println(-1%10);
    }


    public static boolean isPalindrome(int n) {
        Stack<Integer> s = new Stack<>();
        int temp = n;

        boolean bool = false;

        while(n>0){
            s.push(n%10);
            n=n/10;
        }

        n = temp;

        while(n>0){
            int val = s.pop();
            System.out.println("value ="+val);
            if(val == n%10){
                bool = true;
            } else{
                bool = false;
                break;
            }

            n = n/10;

        }

        return bool;
    }
}
