package Leetcode;

public class problem10 {
    public static void main(String[] args) {
        String s = "a";
        String p = "a*";
        System.out.println(isMatch(s,p));
    }

    public static boolean isMatch(String s, String p){
        return isMatch(s,p,0,0);
    }

    private static boolean isMatch(String s, String p, int i, int j) {
        if (j == p.length()) return i == s.length();


        if(i<s.length() && j<p.length()) {
            if (s.charAt(i) == p.charAt(j)) {
                return isMatch(s, p, i + 1, j + 1);
            }

            if (p.charAt(j) == '.') {
                return isMatch(s, p, i + 1, j + 1);
            }

            if (p.charAt(j) == '*') {
                char prev = p.charAt(j - 1);

                if (prev == '.') return true;
                while((i < s.length()) && s.charAt(i) == prev){
                    i++;
                }


                return isMatch(s, p, i, j+1);
            }

            if (p.charAt(j) != s.charAt(i)) {
                return false;
            }
        }

        if (p.charAt(j) == '*') {
            char prev = p.charAt(j - 1);

            if (prev == '.') return true;
            while((i < s.length()) && s.charAt(i) == prev){
                i++;
            }


            return isMatch(s, p, i, j+1);
        }

        return false;
    }


}
