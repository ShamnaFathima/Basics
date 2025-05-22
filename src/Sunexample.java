import java.util.Scanner;
public class Sunexample {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String startDay = sc.next().toLowerCase();
            int n = sc.nextInt();

            String[] week = {"sun", "mon", "tue", "wed", "thu", "fri", "sat"};

            int startIndex = 0;
            for (int i = 0; i < 7; i++) {
                if (week[i].equals(startDay)) {
                    startIndex = i;
                    break;
                }
            }

            int firstSunday = (7 - startIndex) % 7;

            int count = (firstSunday < n) ? ((n - firstSunday - 1) / 7 + 1) : 0;

            System.out.println(count);
            sc.close();
        }
    }
