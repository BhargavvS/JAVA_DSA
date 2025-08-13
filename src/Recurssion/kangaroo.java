package Recurssion;

public class kangaroo {
    public static void main(String[] args) {
        System.out.println(kangarooo(43,2,70,2));
    }

    public static String kangarooo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String result = Countkangaroo(x1,v1,x2,v2);
        return result;

    }

    public static String Countkangaroo(int x1, int v1, int x2, int v2){
        if((x2-x1) == 0) return "YES";

        if((x2-x1) > ((x2-v2) - (x1-v1)) || (x2 - x1) < 0 || (x2-x1) == ((x2-v2) - (x1-v1))) return "NO";

        return Countkangaroo(x1+v1, v1, x2+v2, v2);
    }
}
