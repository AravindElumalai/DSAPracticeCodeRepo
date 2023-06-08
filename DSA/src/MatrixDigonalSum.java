public class MatrixDigonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 }
        };
        diagonalSum(mat);
    }

    static int diagonalSum(int[][] mat) {

        int primary = 0;
        int secondary = 0;
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    primary = primary + mat[i][j];
                }
                if (i != j && i + j == mat[i].length - 1) {
                    secondary = secondary + mat[i][mat.length - i - 1];
                }
            }

        }

        return primary + secondary;
    }
}
