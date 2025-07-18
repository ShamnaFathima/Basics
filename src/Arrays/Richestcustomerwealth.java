package Arrays;
import java.util.Scanner;
public class Richestcustomerwealth {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int m = sc.nextInt();
            int n = sc.nextInt();

            int max = 0;
            for (int i = 0; i < m; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += sc.nextInt();
                }
                if (sum > max) max = sum;
            }

            System.out.println(max);
        }
    }
