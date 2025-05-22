import java.util.Scanner;
public class Sortedbyrisk {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();              // Read size of array
            int[] arr = new int[n];

            // Read array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();         // Elements: 0, 1, or 2
            }

            // Count the number of 0s, 1s, and 2s
            int count0 = 0, count1 = 0, count2 = 0;
            for (int num : arr) {
                if (num == 0) count0++;
                else if (num == 1) count1++;
                else count2++;
            }

            // Overwrite array with sorted values
            int index = 0;
            while (count0-- > 0) arr[index++] = 0;
            while (count1-- > 0) arr[index++] = 1;
            while (count2-- > 0) arr[index++] = 2;

            // Print the sorted array
            for (int num : arr) {
                System.out.print(num + " ");
            }

            sc.close();
        }
    }

