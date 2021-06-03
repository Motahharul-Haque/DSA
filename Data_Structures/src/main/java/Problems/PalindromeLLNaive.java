package Problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeLLNaive {

    public static void main(String[] args) {
        Node head=new Node('g');
        head.next=new Node('f');
        head.next.next=new Node('g');
        if(isPalindrome(head))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    private static boolean isPalindrome(Node head) {

        Deque<Character> stack = new ArrayDeque<>();

        for (Node curr = head; curr != null; curr = curr.next) {
            stack.push((char) curr.data);
        }
        for (Node curr = head; curr != null; curr = curr.next)
        {
            if (stack.pop() != curr.data)
                return false;
        }
        return true;
    }
}
