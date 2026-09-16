package arrays;

public class Rotate {

    public static void main(String[] args) {

    }

    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        for (int i = 0; i < n/2; i++) {

            for(int j = i; j < n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }

        }
    }

}
