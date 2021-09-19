package Tree.BinaryTree;

public class BinaryTree_to_LinkedList {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(30);
        root.right.right = new Node(35);

        Node head = BTToDLL(root);
        printList(head);
    }

    private static void printList(Node head) {
        Node curr = head;

        while (curr != null){
            System.out.println(curr.key + " ");
            curr = curr.right;
        }
    }

    static Node prev = null;
    private static Node BTToDLL(Node root) {
        if (root == null) {
            return root;
        }
        Node head = BTToDLL(root.left);

        if (prev == null) {
            head = root;
        }
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BTToDLL(root.right);

        return head;
    }
}
