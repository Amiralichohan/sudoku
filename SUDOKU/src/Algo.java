import java.util.Arrays;

public class Algo {
    static int N = 5;

    public static boolean isinRange(int[][] board) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (board[i][j] <= 0 || board[i][j] > 5) {
                    return false;
                }
            }
        }
        return true;
    }


    static boolean isValidSudoku(int [][]board) {

        if (!isinRange(board)) {
            return false;
        }

        boolean[] unique = new boolean[N + 1];


        for (int i = 0; i < N; i++) {

            Arrays.fill(unique, false);

            for (int j = 0; j < N; j++) {

                int Z = board[i][j];

                if (unique[Z]) {
                    return false;
                }
                unique[Z] = true;
            }
        }

        for (int i = 0; i < N; i++) {

            Arrays.fill(unique, false);
            for (int j = 0; j < N; j++) {

                int Z = board[j][i];

                if (unique[Z]) {
                    return false;
                }
                unique[Z] = true;
            }
        }
        return true;
    }
}