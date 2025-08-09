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
          System.out.print("END");
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
          if(head == null)  return;
          else {
              while(temp.next != null) {
                  prev = temp;
                  temp = temp.next;
              }

              prev.next = null;

          }
    }

    public Node reverseList(Node head){
          if(head == null) return head;

          Node temp;
          Node prev = null;

          while(head != null){
              temp = head.next;
              head.next =prev;
              prev = head;
              head = temp;
          }

          head = prev;
          return head;
    }

    public void insertRecursion(int val,int index){
        head = insertRecursion(val,index,head);
    }

    private Node insertRecursion(int val,int index,Node node){
          if(index == 0){
              Node temp = new Node(val);
              temp.next = node;
              size++;
              return temp;
          }

          node.next = insertRecursion(val,index-1,node.next);

          return node;
    }

    public Node removeDuplicate(Node head){
          Node temp = head;

          while(temp.next!= null){
              if(temp.val == temp.next.val){
                  temp.next = temp.next.next;
                  size--;
              } else{
                  temp = temp.next;
              }
          }

          return head;
    }

    public static LL mergeTwoLists(LL list1, LL list2) {
          Node head1 = list1.head;
          Node head2 = list2.head;
          LL ans = new LL();

          while(head1 != null && head2 != null){
              if(head1.val <= head2.val){
                  ans.addLast(head1.val);
                  head1= head1.next;
              }else{
                  ans.addLast(head2.val);
                  head2= head2.next;
              }
          }

          while (head1 != null){
              ans.addLast(head1.val);
              head1 = head1.next;
          }

          while (head2 != null){
              ans.addLast(head2.val);
              head2= head2.next;
          }

          return ans;


    }



}
