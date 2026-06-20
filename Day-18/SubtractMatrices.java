import java.util.Arrays;

public class SubtractMatrices {

    public static int[][] subtract(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] a = {{5, 6}, {7, 8}};
        int[][] b = {{1, 2}, {3, 4}};

        int[][] result = subtract(a, b);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}