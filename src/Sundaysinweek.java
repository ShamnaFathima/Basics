 import java.util.Scanner;
    public class Sundaysinweek {

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

            int count = 0;
            for (int i = 0; i < n; i++) {
                int dayIndex = (startIndex + i) % 7;
                if (week[dayIndex].equals("sun")) {
                    count++;
                }
            }

            System.out.println(count);
            sc.close();
        }
    }

