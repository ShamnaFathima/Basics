package TCS1;

    import java.util.Scanner;
public class Candy {
        public static void main(String[] args) {
            final int N = 10;
            final int K = 5;
            int M = N;

            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            if (input <= 0 || input > M) {
                System.out.println("INVALID INPUT");
            } else {
                M -= input;
                if (M <= K) {
                    M = N;
                    System.out.println("Jar Refilled");
                }
                System.out.println("Number of candies left:" + M);
                System.out.println();

            }
            scanner.close();
        }
    }
