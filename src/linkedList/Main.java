package linkedList;

import org.w3c.dom.NodeList;

import static linkedList.LL.mergeTwoLists;
import static linkedList.LL.middleOfList;


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
//        Node middle = (Node) middleOfList(list1.head);
//        System.out.println("Middle Node of list1 is " + middle );




//        System.out.println("Merged Linked List");
//        LL ans = mergeTwoLists(list1,list2);
//        ans.display();
//        list.insertRecursion(10,3);
//        System.out.println("After the reversing the list");
//        list.head = list.reverseList(list.head);


    }
}
