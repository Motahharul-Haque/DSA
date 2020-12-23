package Searching.Binary_Search.RepeatingElement;

public class RepeatingElement {
    public static void main(String[] args) {
        int[] inArray = { 1, 3, 2, 4, 3, 3 };
        int n = 6;
        int res = repeat(inArray, n);
        System.out.println("Repeating Element is : "+res);
    }

    private static int repeat(int[] inArray, int n) {
        int slow = inArray[0], fast = inArray[0];

        do{
            slow = inArray[slow];
            fast = inArray[inArray[fast]];
        }while(slow != fast);

        slow = inArray[0];

        while(slow != fast)
        {
            slow = inArray[slow];
            fast = inArray[fast];
        }

        return slow;
    }
}
