package Arrays;
import java.util.Scanner;
public class Pangram {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String sentence = sc.nextLine();

            boolean result = true;
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (sentence.indexOf(ch) == -1) {
                    result = false;
                    break;
                }
            }

            System.out.println(result);
        }
    }


