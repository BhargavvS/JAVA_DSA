package Trees;

public class AVLMain {
    public static void main(String[] args) {
        AVL avlTree = new AVL();

        for (int i = 0; i < 1000; i++) {
            avlTree.insert(i);
        }

        avlTree.printTree();
        System.out.println(avlTree.height());
    }
}
