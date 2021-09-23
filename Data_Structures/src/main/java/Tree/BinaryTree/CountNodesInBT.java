package Tree.BinaryTree;

public class CountNodesInBT {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.println(countNode(root));
    }

    private static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        else{
            return 1+countNode(root.left)+countNode(root.right);
        }
    }
}
