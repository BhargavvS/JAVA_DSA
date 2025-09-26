package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RecurringDecimal {
    public static void main(String[] args) {
        System.out.println(fractionToDecimal(4,333));
    }

    public static String  fractionToDecimal(int numerator, int denominator){
        Queue<Character> q = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        double division =  (double)numerator / (double)denominator;

        int integerPart = (int) division;
        double fractionPart = division - integerPart;

        if(isRecuuring(String.valueOf(fractionPart),q)){
            result.append("0.(");
            while (!q.isEmpty()){
                result.append(q.poll());
            }
            result.append(")");
        }else{
            return String.valueOf(division);
        }
//        System.out.println(fraction);
        return result.toString();

    }

    private static boolean isRecuuring(String  fraction, Queue<Character> q) {
        if (fraction == null || fraction.isEmpty() || q == null || q.isEmpty()) {
            return false;
        }

        // Convert queue into a string pattern
        StringBuilder sb = new StringBuilder();
        for (char c : q) {
            sb.append(c);
        }
        String pattern = sb.toString();

        // Check if the fraction contains at least two consecutive occurrences of the pattern
        return fraction.contains(pattern + pattern);

    }
}
