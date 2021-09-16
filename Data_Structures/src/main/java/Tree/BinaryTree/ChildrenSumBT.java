package Tree.BinaryTree;

public class ChildrenSumBT {
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.right.left = new Node(3);
        root.right.right = new Node(9);

        System.out.println(isCSum(root));
    }

    private static boolean isCSum(Node root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }
        int sum = 0;
        if (root.left != null) {
            sum += root.left.key;
        }
        if (root.right != null) {
            sum += root.right.key;
        }

        return (root.key == sum && isCSum(root.left) && isCSum(root.right));
    }
}
