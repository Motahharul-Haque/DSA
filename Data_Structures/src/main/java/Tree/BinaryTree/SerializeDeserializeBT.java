package Tree.BinaryTree;

import java.util.ArrayList;

public class SerializeDeserializeBT {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.right = new Node(20);

        ArrayList<Integer> arr = new ArrayList<>();

        serialize(root, arr);

        for (int x : arr){
            System.out.println(x+" ");
        }
        System.out.println();
        Node root_new = deserialize(arr);
        inorder(root_new);
    }

    static final int EMPTY = -1;
    private static void serialize(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            arr.add(EMPTY);
            return;
        }
        arr.add(root.key);
        serialize(root.left, arr);
        serialize(root.right, arr);
    }

    static int index = 0;
    private static Node deserialize(ArrayList<Integer> arr) {
        if (index == arr.size()) {
            return null;
        }
        int val = arr.get(index);
        index++;

        if (val == EMPTY) {
            return null;
        }
        Node root = new Node(val);
        root.left = deserialize(arr);
        root.right = deserialize(arr);
        return root;
    }

    private static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key + " ");
            inorder(root.right);
        }

    }

}
