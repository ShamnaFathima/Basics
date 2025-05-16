package TCS1;
    import java.util.Scanner;
    public class Stringvalidity {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the string: ");
            String input = scanner.nextLine();

            int starCount = 0;
            int hashCount = 0;

            for (char c : input.toCharArray()) {
                if (c == '*') {
                    starCount++;
                } else if (c == '#') {
                    hashCount++;
                }
            }

            int result = starCount - hashCount;
            System.out.println("Output: " + result);

            scanner.close();
        }
    }

