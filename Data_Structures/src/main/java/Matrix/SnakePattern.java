package Matrix;

public class SnakePattern {

    public static void main(String[] args) {
        int[][] inArray = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printSnake(inArray);
    }

    private static void printSnake(int[][] inArray) {

        for (int i = 0; i < inArray.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < inArray[i].length; j++) {
                    System.out.print(inArray[i][j] + " ");
                }
            }
            else
            {
                for (int j = inArray[i].length - 1; j >=0 ; j--) {
                    System.out.print(inArray[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
