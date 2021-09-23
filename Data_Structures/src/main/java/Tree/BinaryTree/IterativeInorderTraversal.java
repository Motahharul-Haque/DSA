package Tree.BinaryTree;

import java.util.Stack;

public class IterativeInorderTraversal {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        inorder(root);
    }

    private static void inorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> s = new Stack<>();
        Node curr = root;

        while (curr != null || s.size() > 0)
        {
            while (curr != null)
            {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.println(curr.key + " ");
            curr = curr.right;
        }
    }
}
