package Matrix;

import java.util.Scanner;
public class Movenonzerostoarr {

    public static void pushZerosToEnd(int[] arr, int n) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements (one per line):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Process and print result
        pushZerosToEnd(arr, n);

        sc.close();
    }
}
