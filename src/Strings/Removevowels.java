package Strings;

public class Removevowels {
        public static void main(String[] args) {
            String str = "Hello World";
            StringBuilder result = new StringBuilder();

            for (char c : str.toCharArray()) {
                if (!"aeiouAEIOU".contains(String.valueOf(c))) {
                    result.append(c);
                }
            }

            System.out.println("String without vowels: " + result.toString());
        }
    }


