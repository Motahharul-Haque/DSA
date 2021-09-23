package Tree.BinaryTree;

import java.util.Stack;

public class IterativePreorderTraversalBetterSoln {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.left.left = new Node(70);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.left.left.right = new Node(80);

        preorderIterative(root);
    }

    private static void preorderIterative(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> s = new Stack<>();
        Node curr = root;

        while (curr != null || !s.isEmpty())
        {
            while (curr != null)
            {
                System.out.println(curr.key + " ");
                if (curr.right != null) {
                    s.push(curr.right);
                }
                curr = curr.left;
            }
            if (!s.isEmpty()) {
                curr = s.pop();
            }
        }
    }
}
