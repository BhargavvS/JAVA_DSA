package Trees;

import java.awt.print.PrinterGraphics;

class SegmentTrees{

    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        Node(int data , int start,int end){
            this.data = data;
            this.startInterval = start;
            this.endInterval = end;
        }

        Node(int start,int end){
            this.startInterval = start;
            this.endInterval = end;
        }
    }

    Node root;

    public void createSegmentTree(int[] nums){
        
        this.root = contructTree(nums,0,nums.length-1);
    }

    private Node contructTree(int[] nums, int startIndex, int endIndex) {
        if(startIndex == endIndex){
            //leaf node
            Node leaf = new Node(startIndex,endIndex);
            leaf.data = nums[startIndex];
            return leaf;
        }

        Node node = new Node(startIndex,endIndex);
        int mid = (startIndex + endIndex) / 2;
        node.left = this.contructTree(nums,startIndex,mid);
        node.right = this.contructTree(nums,mid+1,endIndex);

        node.data = node.left.data  + node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node){
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child => ";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }

    //query
    public int query(int queryStartIndex, int queryEndIndex) {
        return query(this.root,queryStartIndex,queryEndIndex);
    }

    private int query(Node node, int queryStartIndex, int queryEndIndex) {
        if(node.startInterval >= queryStartIndex && node.endInterval<= queryEndIndex){
            return node.data;
        }

        else if(node.startInterval > queryEndIndex || node.endInterval < queryStartIndex){
            return 0;
        }
        else{
            return this.query(node.left , queryStartIndex,queryEndIndex) +
                    this.query(node.right , queryStartIndex,queryEndIndex);
        }
    }

    public void update(int index, int value){
        this.root.data =  update(this.root,index,value);
    }

    private static int update(Node node,int index , int value){
        if(node.startInterval == index && node.endInterval == index){
            node.data = value;
            return node.data;
        }

        else if(node.startInterval > index || node.endInterval < index){
            return node.data;
        }

        else{
          return node.data = update(node.left , index ,value) + update(node.right,index,value);
        }
    }

}


public class Segment {
    public static void main(String[] args) {
        int[] nums = {3,8,7,6,-1,-8,4,9};
        SegmentTrees segmentTrees = new SegmentTrees();
        segmentTrees.createSegmentTree(nums);
        segmentTrees.display();
        int sum = segmentTrees.query(1,6);
        System.out.println("Sum in the interval = [1,6] = " + sum );

        segmentTrees.update(3,14);
        segmentTrees.display();

    }
}
