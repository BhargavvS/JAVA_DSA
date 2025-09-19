package Trees;


import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.rotate;

public class AVL {
    private class Node{
        int val;
        Node left;
        Node right;
        int height;

        Node(int val){
            this.val = val;
        }

    }

//    public int height(){
//        return height(this.root) -1;
//    }
//
//    private int height(Node node){
//        if(node == null) return 0;
//
//        return 1 + Math.max(height(node.left), height(node.right));
//
//    }

    public int height() {
        return height(root);
    }
    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    private Node root;
    AVL(){}

    public void insert(int val){

        root = insert(val,root);
    }


    private Node insert(int val, Node node){
        if(node == null){
            Node newNode = new Node(val);
            return newNode;
        }

        if(val < node.val){
            node.left = insert(val,node.left);
        }

        if(val > node.val){
            node.right = insert(val,node.right);
        }

        node.height = Math.max(height(node.left) , height(node.right)) +1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        if(height(node.left) - height(node.right) > 1){
            // left heavy

            if(height(node.left.left) - height(node.left.right) >0){
                // left-left
                return rightRotate(node);
            }

            if(height(node.left.left) - height(node.left.right) <0){
                // left-right
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < -1){
            // right heavy

            if(height(node.right.left) - height(node.right.right) <0){
                // right-right
                return leftRotate(node);
            }

            if(height(node.right.left) - height(node.right.right) > 0){
                // right-left
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left),height(p.right) +1) ;
        c.height = Math.max(height(c.left),height(c.right) +1)  ;

        return c;
    }

    public void populate(int[] nums){
        if(nums.length == 0) return;

        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void display(){

        display(this.root, "Root value : ");
        return;
    }

    private void display(Node node, String details) {
        if(node == null) return;

        System.out.println(details + node.val);
        display(node.left,"The Left child of :" + node.val + " : ");
        display(node.right,"The Right child of :" + node.val + " : ");
        System.out.println("height of :" + node.val + " = " + node.height);
    }

    public void printTree(){
        printTree(this.root);
    }

    public void printTree(Node root) {
        if (root == null) return;

        int height = root.height;
        int width = (int) Math.pow(2, height) * 2;

        List<Node> current = new ArrayList<>();
        current.add(root);

        for (int level = 1; level <= height; level++) {
            List<Node> next = new ArrayList<>();

            int spaces = width / (int) Math.pow(2, level);
            int between = width / (int) Math.pow(2, level - 1);

            // print nodes
            printSpaces(spaces / 2);
            for (Node node : current) {
                if (node != null) {
                    System.out.print(node.val);
                    next.add(node.left);
                    next.add(node.right);
                } else {
                    System.out.print(" ");
                    next.add(null);
                    next.add(null);
                }
                printSpaces(between - 1);
            }
            System.out.println();

            // print slashes
            if (level != height) {
                printSpaces(spaces / 2);
                for (Node node : current) {
                    if (node != null) {
                        System.out.print(node.left != null ? "/" : " ");
                        printSpaces(between - 2);
                        System.out.print(node.right != null ? "\\" : " ");
                        printSpaces(1);
                    } else {
                        printSpaces(between);
                    }
                }
                System.out.println();
            }

            current = next;
        }
    }

    private void printSpaces(int count) {
        for (int i = 0; i < count; i++) System.out.print(" ");
    }
}

