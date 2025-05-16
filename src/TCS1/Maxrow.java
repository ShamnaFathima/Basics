package TCS1;

import java.util.Scanner;
public class Maxrow{
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int R = sc.nextInt(); // number of rows
            int C = sc.nextInt(); // number of columns

            int[][] matrix = new int[R][C];

            // Read the matrix elements
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            int maxOnes = -1;
            int rowIndex = -1;

            // Find the row with maximum 1's
            for (int i = 0; i < R; i++) {
                int countOnes = 0;
                for (int j = 0; j < C; j++) {
                    if (matrix[i][j] == 1) {
                        countOnes++;
                    }
                }
                if (countOnes > maxOnes) {
                    maxOnes = countOnes;
                    rowIndex = i + 1; // 1-based index
                }
            }

            System.out.println(rowIndex);
            sc.close();
        }
    }


