package Trees;

public class BSTMain {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {15,10,5,11,2,7,26,25,18};
        tree.populate(nums);
        tree.display();
        System.out.println(tree.height());
    }
}
