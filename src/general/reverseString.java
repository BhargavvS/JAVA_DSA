package general;

public class reverseString {
    public static void main(String[] args) {
         StringBuilder str = new StringBuilder("hello world");
         String str1 = str.reverse().toString();
        System.out.println(str1);

        String str2 = "hello world";
        String[] words = str2.split("\\s+");
        String rstr = "";

        for (int i = words.length-1; i >=0 ; i--) {
            rstr += words[i] + " ";
        }

        System.out.println(rstr);
        System.out.println(reverseRecursion("bhargav shankar"));
    }

    public static String reverseRecursion(String str){
        if (str.isEmpty()){
            return str;
        }

        return reverseRecursion(str.substring(1)) + str.charAt(0);
    }
}
