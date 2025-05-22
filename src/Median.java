import java.util.Scanner;

    public class Median {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int r = scanner.nextInt();
            int c = scanner.nextInt();

            int[][] matrix = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            int min = matrix[0][0];
            int max = matrix[0][c - 1];

            for (int i = 1; i < r; i++) {
                min = Math.min(min, matrix[i][0]);
                max = Math.max(max, matrix[i][c - 1]);
            }
            int desired = (r * c + 1) / 2;

            while (min < max) {
                int mid = min + (max - min) / 2;
                int count = 0;

                for (int i = 0; i < r; i++) {
                    count += countSmallerThanOrEqual(matrix[i], mid);
                }

                if (count < desired) {
                    min = mid + 1;
                } else {
                    max = mid;
                }
            }

            System.out.println(min);
        }

        static int countSmallerThanOrEqual(int[] row, int target) {
            int low = 0, high = row.length;
            while (low < high) {
                int mid = (low + high) / 2;
                if (row[mid] <= target) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }
    
