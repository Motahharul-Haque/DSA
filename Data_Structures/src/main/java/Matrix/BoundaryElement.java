package Matrix;

public class BoundaryElement {

    public static void main(String[] args) {
        int[][] inArray = {{1, 2, 3, 4,},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        boundaryTraversal(inArray);
    }

    static int R = 4, C = 4;

    private static void boundaryTraversal(int[][] inArray) {
        if (R == 1) {
            for (int i = 0; i < C; i++) {
                System.out.print(inArray[0][i]);
            }
        } else if (C == 1) {
            for (int i = 0; i < R; i++) {
                System.out.print(inArray[i][0]);
            }
        } else {
            for (int i = 0; i < C; i++)
                System.out.print(inArray[0][i] + " ");
            for (int i = 1; i < R; i++)
                System.out.print(inArray[i][C - 1] + " ");
            for (int i = C - 2; i >= 0; i--)
                System.out.print(inArray[R - 1][i] + " ");
            for (int i = R - 2; i >= 1; i--)
                System.out.print(inArray[i][0] + " ");

        }

    }
}
