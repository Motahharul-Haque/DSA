package Tree.BinaryTree;

public class Is_Balanced_BT {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(30);
        root.right.left = new Node(15);
        root.right.right = new Node(20);

        if (isBalanced(root) > 0) {
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }

    private static int isBalanced(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = isBalanced(root.left);
        if (lh == -1) {
            return -1;
        }
        int rh = isBalanced(root.right);
        if (rh == -1) {
            return -1;
        }
        if (Math.abs(lh-rh) > 1) {
            return -1;
        }
        else{
            return Math.max(lh,rh)+1;
        }
    }
}
