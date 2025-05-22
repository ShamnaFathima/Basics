import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Creating Scanner object to get input
        Scanner sc = new Scanner(System.in);

        // Input the number of members (N)
        System.out.print("Enter the number of members (N): ");
        int N = sc.nextInt();

        // Check if N is less than 2 (if true, no valid arrangement)
        if (N < 2) {
            System.out.println("0");
            return;
        }

        // Calculate the number of ways using the formula: (N-2)! * 2
        long result = factorial(N - 2) * 2;

        // Output the result (Total number of ways to arrange members)
        System.out.println("Possible ways of seating the members: " + result);
    }

    // Method to calculate factorial of a number
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
