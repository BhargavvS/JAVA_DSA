package Queues;

public class CustomQueue {
    protected int[] data;
    public int rear = 0;
    private static final int DEFAULT_SIZE = 10;
    CustomQueue(){
        this(DEFAULT_SIZE);
    }

    CustomQueue(int size){
        data = new int[size];
    }

    public void insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }

        data[rear++] = item;
    }

    public int delete(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        int value = data[0];
        for(int i=1;i<rear;i++){
            data[i-1] = data[i];
        }
        rear--;
        return value;
    }

    public boolean isFull(){
        return rear == data.length;
    }

    public boolean isEmpty(){
        return rear == 0;
    }
}
