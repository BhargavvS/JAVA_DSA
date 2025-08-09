package linkedList;

import static linkedList.LL.mergeTwoLists;


public class Main {
    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();

        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(5);
        list2.addLast(2);
        list2.addLast(4);
        list2.addLast(13);
        list2.addLast(24);
        list1.display();
        System.out.println();
        list2.display();
        System.out.println();
        System.out.println("Merged Linked List");
//        list.deleteLast();
//        System.out.println("After the reversing the list");
//        list.head = list.reverseList(list.head);
//        list.insertRecursion(10,3);
        LL ans = mergeTwoLists(list1,list2);
        ans.display();


        System.out.println();


        System.out.println();

//        doublyLL dlist = new doublyLL();
//        dlist.addLast(1);
//        dlist.addLast(2);
//        dlist.addLast(3);
//        dlist.addLast(4);
//        dlist.addLast(5);
//
//        dlist.display();
//        System.out.println();
//        System.out.println("After reversal");
//
//        dlist.head = dlist.reverseDList(dlist.head);
//        dlist.display();
    }
}
