package TCS2;
import java.util.Scanner;

public class Jeremyfammax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] prefixSum = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i - 1];
        }

        int maxTotal = Integer.MIN_VALUE;

        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                int sum1 = prefixSum[j] - prefixSum[i - 1];

                for (int x = j + k + 1; x <= N; x++) {
                    for (int y = x; y <= N; y++) {
                        int sum2 = prefixSum[y] - prefixSum[x - 1];
                        int total = sum1 + sum2;

                        if (total > maxTotal) {
                            maxTotal = total;
                        }
                    }
                }
            }
        }

        System.out.println(maxTotal);

        sc.close();
    }
}
