package functions;

public class shadow {
    static int x = 20; // this can be accessed in the entire class
    public static void main(String[] args) {
        System.out.println(x);

        int x = 30; // now creating a new variable and initialzing it .
        // now this "new" value if "x" will "shadow" the upper value of x.
        System.out.println(x);
        display();
    }

    static void display(){
        System.out.println(x); // will access the global value of x
    }
}
