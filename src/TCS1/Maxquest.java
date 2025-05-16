package TCS1;


    import java.util.Scanner;
     public class Maxquest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            int[] E = new int[T];
            int[] L = new int[T];

            for (int i = 0; i < T; i++) {
                E[i] = sc.nextInt();
            }
            for (int i = 0; i < T; i++) {
                L[i] = sc.nextInt();
            }
            int currentGuests = 0;
            int maxGuests = 0;
            for (int i = 0; i < T; i++) {
                currentGuests = currentGuests + E[i] - L[i];
                maxGuests = Math.max(maxGuests, currentGuests);
            }
            System.out.println(maxGuests);
            sc.close();
        }
    }

