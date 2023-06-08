import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        transposeMatrix(matrix);
    }

    static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] tranMatrix = new int[col][row];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tranMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(tranMatrix[0]));
        System.out.println(Arrays.toString(tranMatrix[1]));
        System.out.println(Arrays.toString(tranMatrix[2]));
        return tranMatrix;
    }
}
