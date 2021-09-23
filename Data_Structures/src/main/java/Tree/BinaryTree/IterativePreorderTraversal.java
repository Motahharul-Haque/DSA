package Tree.BinaryTree;

import java.util.Stack;
tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.left.left = new Node(70);
        tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.left.left.right = new Node(80);

        tree.preorderIterative();
public class IterativePreorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);
        iterativePreorder(root);
    }

    private static void iterativePreorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> s = new Stack<>();
        s.push(root);

        while (s.empty() == false){
            Node curr = s.peek();
            System.out.println(curr.key + " ");
            s.pop();

            if (curr.right != null) {
                s.push(curr.right);
            }
            if (curr.left != null) {
                s.push(curr.left);
            }
        }
    }
}
