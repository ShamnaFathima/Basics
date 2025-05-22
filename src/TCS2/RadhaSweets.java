package TCS2;
import java.util.Arrays;
import java.util.Scanner;
public class RadhaSweets {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int max = 0, winner = -1;
            boolean tie = false;

            for (int i = 0; i < n; i++) {
                int box = scan.nextInt();
                int[] sweet = new int[box];

                for (int j = 0; j < box; j++) {
                    sweet[j] = scan.nextInt();
                }

                Arrays.sort(sweet);
                int uniq = 0;

                for (int j = 0; j < box; j++) {
                    if (j == 0 || sweet[j] != sweet[j - 1]) {
                        uniq++;
                    }
                }

                int score = box;
                if (uniq == 4) score += 1;
                if (uniq == 5) score += 2;
                if (uniq >= 6) score += 4;

                if (score > max) {
                    max = score;
                    winner = i;
                    tie = false;
                } else if (score == max) {
                    tie = true;
                }
            }

            if (tie) {
                System.out.println("tie");
            } else if (winner == 0) {
                System.out.println("chef");
            } else {
                System.out.println(winner + 1);
            }
        }
    }

