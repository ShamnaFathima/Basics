package Strings;

public class Countvowels {
        public static void main(String[] args) {
            String str = "OpenAI";
            int count = 0;

            str = str.toLowerCase();
            for (char c : str.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }

            System.out.println("Number of vowels: " + count);
        }
    }


