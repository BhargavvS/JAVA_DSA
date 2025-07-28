package Subseq;

import java.util.ArrayList;
import java.util.Iterator;

public class subseqMain {
    public static void main(String[] args) {
        ArrayList<String> list = subseqList("","abc");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    public static ArrayList<String> subseqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }


        char ch = up.charAt(0);
       ArrayList<String> left =  subseqList(p+ch,up.substring(1));
        ArrayList<String> right = subseqList(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
