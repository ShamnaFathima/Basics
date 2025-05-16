package TCS1;

import java.util.Scanner;

public class Ballooncount {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            scanner.nextLine();
            String[] balloons = new String[N];
            for (int i = 0; i < N; i++) {
                balloons[i] = scanner.nextLine();
            }
            for (int i = 0; i < N; i++) {
                String color = balloons[i];
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if (balloons[j].equals(color)) {
                        count++;
                    }
                }
                if (count % 2 != 0) {
                    System.out.println(color);
                    return;
                }
            }
            System.out.println("All are even");
        }
    }


