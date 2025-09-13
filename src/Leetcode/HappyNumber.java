package Leetcode;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n){
        int fast =n;
        int slow = n;

        do{
            slow = nextNumber(slow);
            fast = nextNumber(nextNumber(fast));
        } while (slow != fast);

        if(slow ==1 ) return true;
        return false;
    }

    private static int nextNumber(int n) {
        int sum =0;
        while (n>0){
            int rem = n%10;
            sum += rem * rem;
            n = n/10;
        }

        return sum;
    }
}
