package subset;

public class LongestStringWithoutDuplicate {
    public static void main(String[] args) {
        int count = StringCount("abcabcbb");
        System.out.println(count);
    }

    public static int StringCount(String s){
        if(s.isEmpty()){
            return 0;
        }
        int count;

      count =  Math.max(maxCount("",s),StringCount(s.substring(1)));
        return count;
    }

    private static int maxCount(String p, String up) {
        if(up.contains(p) || up.isEmpty()){
            return 1;
        }

        int count =0;
        char ch = up.charAt(0);
        System.out.println(count);
        count = count + maxCount(p+ch,up.substring(1));
        return count;
    }

}

