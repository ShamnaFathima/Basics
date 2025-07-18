package Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class candies {
        public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);

                    int n = sc.nextInt();
                    int[] candies = new int[n];

                    for (int i = 0; i < n; i++) {
                        candies[i] = sc.nextInt();
                    }

                    int extraCandies = sc.nextInt();

                    int max = 0;
                    for (int c : candies) {
                        if (c > max) max = c;
                    }

                    List<Boolean> result = new ArrayList<>();
                    for (int c : candies) {
                        result.add(c + extraCandies >= max);
                    }
                    System.out.println(result);
                }
            }


