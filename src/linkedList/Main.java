package linkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
//        list.addLast(4);
//        list.display();
//        System.out.println();
////        list.deleteLast();
//        System.out.println("After the reversing the list");
//        list.head = list.reverseList(list.head);
//        list.display();

        doublyLL dlist = new doublyLL();
        dlist.addLast(1);
        dlist.addLast(2);
        dlist.addLast(3);
        dlist.addLast(4);
        dlist.addLast(5);

        dlist.display();
        System.out.println();
        System.out.println("After reversal");

        dlist.head = dlist.reverseDList(dlist.head);
        dlist.display();
    }
}
