package Matrix;

public class Transpose {

    public static void main(String[] args) {

        int[][] mat = { { 1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println("Before transpose : ");
        printMatrix(mat);

        getTranspose(mat);

        System.out.println("After transpose : ");
        printMatrix(mat);
    }

    private static void printMatrix(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    //to get the transpose of a matrix in-place and one traversal
    //we see the diagonal element of input and output matrix is same
    //we perform swapping only upper and lower triangle.
    private static void getTranspose(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat.length; j++) {
                swap(mat, i, j);
            }
        }
    }
    //swapping the elements of upper triangle with lower triangle
    private static void swap(int [][] mat, int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;


    }
}
