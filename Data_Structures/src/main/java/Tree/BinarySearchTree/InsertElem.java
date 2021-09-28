package Tree.BinarySearchTree;

public class InsertElem {

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.right=new Node(18);
        int x=20;

        root=insert(root,x);
        inorder(root);
    }

    private static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key+" ");
            inorder(root.right);
        }
    }

    private static Node insert(Node root, int x) {
        if (root == null) {
            return new Node(x);
        }
        else if (root.key < x) {
            root.right = insert(root.right, x);
        }
        else if (root.key > x) {
            root.left = insert(root.right, x);
        }

        return root;
    }
}
