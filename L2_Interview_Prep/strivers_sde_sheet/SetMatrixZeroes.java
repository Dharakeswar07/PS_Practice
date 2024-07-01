package L2_Interview_Prep.strivers_sde_sheet;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1}};
        int[][] matrix1 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
    }

  /*  public static void setZeroes(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {

                    markRow(i, arr);
                    markCol(j, arr);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == -10) {
                    arr[i][j] = 0;
                }
            }


        }
    }

    public static void markRow(int i, int[][] arr) {
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -10;
            }
        }
    }

    public static void markCol(int j, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -10;
            }
        }
    }*/
  public static void setZeroes(int[][] matrix) {
      boolean firstRow = false, firstCol = false;

      for (int i = 0; i < matrix.length; i++)
          for (int j = 0; j < matrix[0].length; j++)
              if (matrix[i][j] == 0) {
                  if (i == 0) firstRow = true;
                  if (j == 0) firstCol = true;
                  matrix[0][j] = 0;
                  matrix[i][0] = 0;
              }
      for (int i = 1; i < matrix.length; i++)
          for (int j = 1; j < matrix[0].length; j++)
              if (matrix[i][0] == 0 || matrix[0][j] == 0)
                  matrix[i][j] = 0;

      // Last remaining checks
      if (firstRow)
          for (int j = 0; j < matrix[0].length; j++)
              matrix[0][j] = 0;

      if (firstCol)
          for (int i = 0; i < matrix.length; i++)
              matrix[i][0] = 0;
  }
}
