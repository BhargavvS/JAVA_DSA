package Trees;

import java.util.Scanner;

public class BinaryTree {
    public class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    public Node root;
    BinaryTree(){}

    // insert
    public void populate(Scanner sc){
        System.out.println("Enter the root node value");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do u want to enter the left of " + node.val );
        int left = sc.nextInt();
        if(left == 1){
            System.out.println("Enter the left node value of the node "+ node.val);
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc,node.left);
        }

        System.out.println("Do u want to enter the right of " + node.val );
        int right = sc.nextInt();
        if(right == 1){
            System.out.println("Enter the right node value of the node "+ node.val);
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc,node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent) {
        if(node == null) return;

        System.out.println(indent + node.val);
        display(node.left,indent+ "\t");
        display(node.right,indent+"\t");
    }
}
