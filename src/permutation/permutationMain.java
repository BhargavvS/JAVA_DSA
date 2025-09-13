package permutation;

import java.util.ArrayList;
import java.util.List;

public class permutationMain {
    public static void main(String[] args) {
            perm("","abc");
//            List<String> ans = permList("","abc");
//        System.out.println(ans);
//
//        System.out.println(permCount("","abc"));
//        permNum(0,123);
//        List<Integer> list = permNumList(0,1234);
//        System.out.println(list);
    }

    public static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i);
            perm(first+ch+second,up.substring(1));
        }
    }

    public static List<String> permList(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();
        for (int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i);
            ans.addAll(permList(first+ch+second,up.substring(1)));
        }

        return ans;
    }

    public static int permCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count =0;
        for (int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i);
           count = count+ permCount(first+ch+second,up.substring(1));
        }

        return count;
    }

    public static void permNum(int p, int up){
        if(up%10 == 0){
            System.out.println(reverse(p));
            return;
        }
        int num = up%10;
        permNum(p*10 + num,up/10);
        permNum(p,up/10);

        return;
    }

    public static List<Integer> permNumList(int p, int up){
        if(up%10 == 0){
            List<Integer>  list = new ArrayList<>();
            list.add(reverse(p));
            return list;
        }

        List<Integer> result = new ArrayList<>();
        int num = up%10;
       List<Integer> left =  permNumList(p*10 + num,up/10);
        List<Integer> right = permNumList(p,up/10);

        result.addAll(left);
        result.addAll(right);

        return result;
    }


    private static int reverse(int num){
        int r=0;

        while(num >0){
            int n = num %10;
            r = r*10 + n;
            num /=10;
        }

        return  r;
    }


}
