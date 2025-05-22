package Strings;

public class Stringlength {
        public static void main(String[] args) {
            String str = "Hello";

            int length = 0;
            for (char c : str.toCharArray()) {
                length++;
            }

            System.out.println("Length of the string: " + length);
        }
    }


