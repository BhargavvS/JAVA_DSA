package Queues;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(60);
//        queue.insert(50);
        queue.insert(40);

        System.out.println("queue deleted elements are:");
        System.out.println(queue.delete());
        System.out.println(queue.delete());
        System.out.println(queue.delete());
        System.out.println(queue.delete());
        System.out.println(queue.delete());
        System.out.println(queue.delete());



    }
}
