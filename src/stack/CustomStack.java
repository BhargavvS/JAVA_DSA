package stack;

public  class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    static int top = -1;

    CustomStack(){
        this(DEFAULT_SIZE);
    }

    CustomStack(int size){
        this.data = new int[size];
    }

    public void push(int num){
        if(top == data.length){
            System.out.println("Stack is full");
            return;
        }

        data[++top] = num;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return -1;
        }

        int val = data[top];
        top--;
        return val;
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return -1;
        }
         return data[top];
    }

    public boolean isFull(){
        return top == data.length-1;
    }



}
