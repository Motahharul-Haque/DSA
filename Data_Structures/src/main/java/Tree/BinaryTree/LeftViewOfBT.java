package Tree.BinaryTree;

public class LeftViewOfBT {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        printLeftView(root);
    }

    static int maxLevel = 0;
    private static void printLeftView(Node root) {
        printLeft(root, 1);
    }

    private static void printLeft(Node root, int level) {
        if (root == null) {
            return;
        }
        if (maxLevel < level) {
            System.out.println(root.key + " ");
            maxLevel = level;
        }
        printLeft(root.left, level + 1);
        printLeft(root.right, level + 1);
    }
}
