package Strings;

import java.util.Locale;

public class StringPallindrome {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
        String s = " ";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String s1 = removeNonAlphanumeric(s);
        int i=0;
        int j=s1.length() -1;
        boolean valid = false;
        System.out.println(s1);
        if(s1.equals("")) {
            return true;
        }

        while(i<=j) {
            if(s1.charAt(i) == s1.charAt(j)) {
                i++;
                j--;
                valid = true;
            } else {
                valid = false;
                break;
            }
        }

        return valid;
    }

   public static String removeNonAlphanumeric(String str)
    {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        return str;
    }
}
