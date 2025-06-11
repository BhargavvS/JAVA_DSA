package linkedList;

public class LL {

   private class Node{
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next =  null;
        }

        Node(int val, Node next)
        {
            this.val = val;
            this.next = next;
        }
    }

     Node head;
     Node tail;
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
          }

          if (tail == null) {
              tail = head;
          }
          size++;
      }

      public void display() {
          temp = head;
          while(temp != null) {
              System.out.print(temp.val + " -> ");
              temp = temp.next;
          }
      }

    public void addFirst(int val) {
        Node newnode = new Node(val);
        if(head == null) {
            head= newnode;
            newnode.next = head;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void deleteLast() {
          temp = head;
        Node prev= temp;
          if(head == null) return;
          else {
              while(temp.next != null) {
                  prev = temp;
                  temp = temp.next;
              }

              prev.next = null;

          }
    }



}
