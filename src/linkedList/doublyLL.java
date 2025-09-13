package linkedList;

public class doublyLL {
    private class Node{
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next =  null;
            this.prev = null;
        }

        Node(int val, Node next)
        {
            this.val = val;
            this.next = next;
        }
    }

    Node head;
//    Node tail;
    Node temp;
    static int size =0 ;


    public void addLast(int val) {
        Node newnode = new Node(val);

        if (head == null) {
            head= newnode;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newnode;
            newnode.prev = temp;
        }

        size++;
    }

    public void display() {
        temp = head;
        System.out.print("null");
        while(temp != null) {
            System.out.print(" <- " + temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }


    public Node reverseDList(Node head){
        if(head == null) return head;

        Node last = head;
        Node temp;


        while (last.next!=null) last= last.next;
        head = last;

        while (last!= null){
            temp = last.prev;
            last.prev = last.next;
            last.next = temp;
            last = temp;
        }


        return head;

    }

    public static void main(String[] args) {
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
