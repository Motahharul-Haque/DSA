package Tree.BinaryTree;

public class Is_Balanced_BT_Naive {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.right.left = new Node(15);
        root.right.right = new Node(20);

        if (isBalanced(root)) {
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }

    private static boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return (Math.abs(lh-rh) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }

    private static int height(Node root) {
        if (root == null) {
            return 0;
        }
        else{
            return (1 + Math.max(height(root.left), height(root.right)));
        }
    }


}
