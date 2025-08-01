package Leetcode;

public class romanTonumber {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int n=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'I'){
                if(i+1<s.length()){
                    char next = s.charAt(i+1);
                    if(next == 'V') n = n+4;
                    else if(next == 'X') n = n+9;
                    else n+=1;
                }
                else n+=1;
            }
            else if(ch == 'X'){
                if(i+1<s.length()) {
                    char next = s.charAt(i + 1);
                    if (next == 'L') n = n + 40;
                    else if (next == 'C') n = n + 90;
                    else n += 10;
                }else if(i>0){
                    char prev = s.charAt(i - 1);
                    if (prev != 'I') n = n + 10;
                }else n+=10;
            }
            else if(ch == 'V'){
                if(i>0) {
                    char prev = s.charAt(i - 1);
                    if (prev != 'I') n = n + 5;
                } else n += 5;
            }

            else if(ch == 'L'){
                if(i>0) {
                    char prev = s.charAt(i - 1);
                    if (prev != 'X') n = n + 50;
                } else n += 50;
            }
            else if(ch == 'C'){
                if(i>0) {
                    char prev = s.charAt(i - 1);
                    if (prev != 'X') n = n + 100;
                } else n += 100;
            }
            else if(ch == 'D') n+=500;
            else n+=1000;

        }

        return n;
    }
}

