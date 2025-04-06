package linearSearch;

public class stringLinearSearch {
    public static void main(String[] args) {
        String str = "This is a java program";
        char target = 'j';

        System.out.println("element exist " + StrLS(str , target));
        System.out.println("element exist " + StrLS2(str , target));
    }

    static boolean StrLS(String str , char target) {
        if(str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length() ; i++) {
            if(target == str.charAt(i)) {
                return  true;
            }
        }

        return false;
    }

    static boolean StrLS2(String str , char target) {
        if(str.length() == 0) {
            return false;
        }

      for(char ch : str.toCharArray()) {
          if(ch == target) {
              return true;
          }
      }

        return false;
    }
}
