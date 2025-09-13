package linkedList;

public class ListNode {

        int val;
     ListNode next;
        ListNode() {}
        ListNode(int val)
        {
            this.val = val;
        }

        ListNode(int val, ListNode next)
        {
            this.val = val;
            this.next = next;
        }


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
        return;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        int sum =0;
        int rem =0;
        int val = 0;
        while(l1.next !=null || l2.next != null) {
            sum = rem + l1.val+l2.val;

            if(sum >=10){
                rem = sum /10;
                val = sum %10;
            } else {
                rem =0;
                val = sum;
            }

     ListNode newNode = new ListNode(val);
            newNode.next = ans;
            ans = newNode;
        }

        while(l1!= null){
            sum = rem + l1.val;

            if(sum >=10){
                rem = sum /10;
                val = sum %10;
            } else {
                rem =0;
                val = sum;
            }

           ListNode newNode = new ListNode(val);
            newNode.next = ans;
            ans = newNode;
        }

        while(l2 != null){
            sum = rem + l2.val;

            if(sum >=10){
                rem = sum /10;
                val = sum %10;
            } else {
                rem =0;
                val = sum;
            }

           ListNode newNode = new ListNode(val);
            newNode.next = ans;
            ans = newNode;
        }

        return ans;

    }

    public static void main(String[] args) {
     ListNode l1 = new ListNode();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        ListNode l2 = new ListNode();
        l2.addLast(1);
        l2.addLast(2);
        l2.addLast(3);
        l2.addLast(4);
        l2.addLast(5);

        System.out.println("elements of l1");
        l1.display();



        ListNode ans = addTwoNumbers(l1,l2);
        ans.display();


    }
}
