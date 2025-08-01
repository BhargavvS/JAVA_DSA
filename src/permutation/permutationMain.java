package permutation;

import java.util.ArrayList;
import java.util.List;

public class permutationMain {
    public static void main(String[] args) {
            perm("","abc");
            List<String> ans = permList("","abc");
        System.out.println(ans);

        System.out.println(permCount("","abc"));
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

}
