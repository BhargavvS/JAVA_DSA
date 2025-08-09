package Trees;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bs = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        bs.populate(sc);
        bs.display();
    }
}
