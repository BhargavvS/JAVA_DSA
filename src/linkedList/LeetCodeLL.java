package linkedList;

import java.sql.ClientInfoStatus;

public class LeetCodeLL {

    ListNode head;
    ListNode temp;
    ListNode tail;
    public static int size =0;

    public void addLast(int val) {
        ListNode newnode = new ListNode(val);

        if (head == null) {
            head= newnode;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newnode;
        }

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        temp = this.head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public static class ListNode
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val)
        {
            this.val = val;
        }

        ListNode(int val, ListNode next)
        {
            this.val = val; this.next = next;
        }


    }
}
