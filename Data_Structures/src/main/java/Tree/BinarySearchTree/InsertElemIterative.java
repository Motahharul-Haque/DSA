package Tree.BinarySearchTree;

public class InsertElemIterative {

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
        Node temp = new Node(x);
        Node parent = null, curr = root;

        while (curr != null)
        {
            parent = curr;

            if (curr.key > x) {
                curr = curr.left;
            }
            else if (curr.key < x) {
                curr = curr.right;
            }
            else{
                return root;
            }
        }
        if (parent == null) {
            return temp;
        }
        if (parent.key > x) {
            parent.left = temp;
        }
        else
        {
            parent.right = temp;
        }
        return root;
    }
}
