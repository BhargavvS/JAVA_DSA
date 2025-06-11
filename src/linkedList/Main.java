package linkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(41);
        list.display();
        System.out.println();
        list.deleteLast();
        list.display();
    }
}
