package functions;

import java.util.Arrays;

public class varAgs {
    public static void main(String[] args) {
        display(1, 2, 3, 4, 5);
        displayStrings("bhargav","harii", "suhas");
    }

    static void display(int ...numbers){
        System.out.println(Arrays.toString(numbers));
    }
    static void displayStrings(String ...value){
        System.out.println(Arrays.toString(value));
    }
}
