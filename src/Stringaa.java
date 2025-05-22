 import java.util.Scanner;
    public class Stringaa {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            int l = sc.nextInt();
            int maxA = 0;

            for (int i = 0; i < str.length(); i += l) {
                int end = Math.min(i + l, str.length());
                String part = str.substring(i, end);
                int count = 0;
                for (char c : part.toCharArray()) {
                    if (c == 'a') count++;
                }
                if (count > maxA) maxA = count;
            }

            System.out.println(maxA);
        }
    }

