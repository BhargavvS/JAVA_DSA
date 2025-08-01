package subset;


import java.util.ArrayList;
import java.util.List;

// leetcode 17
public class LetterCombination {
    public static void main(String[] args) {
//        lcp("","233");
//        List<String> ans = lcpList("","233");
//        System.out.println(ans);
//        System.out.println(lcpCount("","233"));

        List<String> ans = lcpList2to9("","8");
        System.out.println(ans);
    }

    public static void lcp(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            if(p.equals("egg")){
                System.out.println(true);
            }
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char)('a'+i);
            lcp(p+ch,up.substring(1));
        }
    }

    public static List<String> lcpList(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        List<String> ans = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char)('a'+i);
            ans.addAll(lcpList(p+ch,up.substring(1)));
        }

        return ans;
    }

    public static int lcpCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0';
        int count =0;
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char)('a'+i);
           count = count +  lcpCount(p+ch,up.substring(1));
        }

        return count;
    }


    public static List<String> lcpList2to9(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        List<String> ans = new ArrayList<>();

        if(digit == 7 || digit == 9){
            for (int i = (digit-2)*3; i <= (digit-1)*3; i++) {
                char ch = (char)('a'+i);
                ans.addAll(lcpList2to9(p+ch,up.substring(1)));
            }
        } else if(digit == 8){
            for (int i = (digit-2)*3+1;i< (digit-1)*3+1 ; i++) {
                char ch = (char)('a'+i);
                ans.addAll(lcpList2to9(p+ch,up.substring(1)));
            }
        }else {
            for (int i = (digit-2)*3;i< (digit-1)*3 ; i++) {
                char ch = (char)('a'+i);
                ans.addAll(lcpList2to9(p+ch,up.substring(1)));
            }

        }



        return ans;
    }


}
