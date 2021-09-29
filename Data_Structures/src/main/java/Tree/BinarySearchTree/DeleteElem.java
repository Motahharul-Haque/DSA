package Tree.BinarySearchTree;

public class DeleteElem {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.right=new Node(18);
        int x=15;

        root=delNode(root,x);
        inorder(root);
    }

    private static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key +" ");
            inorder(root.right);
        }
    }

    private static Node delNode(Node root, int x) {
        if (root == null) {
            return root;
        }
        if (root.key > x) {
            root.left = delNode(root.left, x);
        }
        else if (root.key < x) {
            root.right = delNode(root.right, x);
        }
        else{
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            else{
                Node succ = getSuccessor(root);
                root.key = succ.key;
                root.right = delNode(root.right, succ.key);
            }
        }
        return root;
    }

    private static Node getSuccessor(Node curr) {

        curr = curr.right;
        while (curr != null && curr.left != null)
            curr = curr.left;
        return curr;
    }
}
