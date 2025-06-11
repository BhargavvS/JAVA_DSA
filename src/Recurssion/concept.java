package Recurssion;

public class concept {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
//        print(n--); => stack overflow , it it will pass the value and then subtracts the value, so infite loop like 5 , 5,5 , 5,
        print(--n); // this will subtract first and then pass the value like 5 , 4, 3 , 2 , 1
    }
}
