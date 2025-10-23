package Trees.problems;
import java.util.*;
//import org.w3c.dom.;

class BinaryTree {
    public class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public Node findSuccessor(Node root,int value){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        if(root.val == value) return root.left;

        while(!q.isEmpty()) {
            Node node = q.poll();
            if(node.val == value){
               break;
            }

            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
        }

        return q.peek();
    }

    public List<List<Integer>> zigzag(Node root){
        Deque<Node> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> result = new ArrayList<>();
        boolean j=false;
        while(!q.isEmpty()) {
            int len = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<len;i++) {
                if(j) {
                    Node node = q.removeLast();
                    list.add(node.val);
                    if(node.left != null) q.addFirst(node.left);
                    if(node.right != null) q.addFirst(node.right);
                }
                else {
                    Node node = q.removeFirst();
                    list.add(node.val);
                    if(node.left != null) q.add(node.left);
                    if(node.right != null) q.add(node.right);
                }
            }
            j = !j;
            result.add(list);
        }

        return result;
    }
}

public class levelOrderSucessor {
    public static void main(String[] args) {

    }

}
