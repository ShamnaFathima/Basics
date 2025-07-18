package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Numberssmallerthancurrent {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[j] < nums[i]) count++;
                }
                ans[i] = count;
            }

            System.out.println(Arrays.toString(ans));
        }
    }

