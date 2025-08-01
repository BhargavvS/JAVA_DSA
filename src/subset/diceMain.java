package subset;

import java.util.ArrayList;
import java.util.List;

public class diceMain {
    public static void main(String[] args) {
        dice("",4);
        List<String> ans = diceList("",4);
        System.out.println(ans);
    }

    public static void dice(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i<=target; i++) {
            dice(p+i,target-i);
        }
    }

    public static List<String> diceList(String p,int target){
        if(target == 0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i<=target; i++) {
            ans.addAll(diceList(p+i,target-i));
        }
        return ans;
    }
}
