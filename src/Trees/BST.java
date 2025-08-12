package Trees;

public class BST {
    private class Node{
        int val;
        Node left;
        Node right;
        int height;

        Node(int val){
            this.val = val;
        }

    }

    public int height(){
        return height(this.root) -1;
    }

    private int height(Node node){
        if(node == null) return 0;

        return 1 + Math.max(height(node.left), height(node.right));

    }

    private Node root;
    BST(){}

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

        node.height = Math.max(height(node.left) , height(node.right));

        return node;
    }

    public void populate(int[] nums){
        if(nums.length == 0) return;

        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void display(){
        display(this.root, "Root value : ");
    }

    private void display(Node node, String details) {
        if(node == null) return;

        System.out.println(details + node.val);
        display(node.left,"The Left child of :" + node.val + " : ");
        display(node.right,"The Right child of :" + node.val + " : ");
        System.out.println("height of :" + node.val + " = " + node.height);
    }
}
