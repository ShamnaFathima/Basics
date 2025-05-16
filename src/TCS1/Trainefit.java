package TCS1;

    import java.util.Scanner;
     public class Trainefit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] oxygen = new int[3][3];
            int[] avg = new int[3];

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int value = sc.nextInt();
                    if (value >= 1 && value <= 100) {
                        oxygen[j][i] = value;
                    } else {
                        oxygen[j][i] = 0;
                    }
                }
            }

            int max = 0;
            for (int i = 0; i < 3; i++) {
                int sum = 0;
                for (int j = 0; j < 3; j++) {
                    sum += oxygen[i][j];
                }
                avg[i] = Math.round(sum / 3.0f);
                if (avg[i] > max) {
                    max = avg[i];
                }
            }

            if (max < 70) {
                System.out.println("All trainees are unfit");
            } else {
                for (int i = 0; i < 3; i++) {
                    if (avg[i] == max) {
                        System.out.println("Trainee Number : " + (i + 1));
                    }
                }
            }

            sc.close();
        }
    }

