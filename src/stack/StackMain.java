package stack;

public class StackMain {
    public static void main(String[] args) {
//        CustomStack stack1 = new CustomStack(5);
//        stack1.push(10);
//        stack1.push(20);
//        stack1.push(30);
//        stack1.push(40);
//        stack1.push(50);
//
//        System.out.println("poped elements");
//        System.out.println(stack1.pop());
//        System.out.println(stack1.pop());
//
//        System.out.println("peek value");
//        System.out.println(stack1.peek());

        DynamicStack stack2 = new DynamicStack(5);
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        stack2.push(40);
        stack2.push(50);
        stack2.push(60);
        stack2.push(70);
        stack2.push(80);
        stack2.push(90);
        stack2.push(100);

        stack2.display();

    }
}
