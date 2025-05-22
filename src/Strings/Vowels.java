package Strings;

public class Vowels {
        public static void main(String[] args) {
            char ch = 'a';

            // Convert to lowercase for uniformity
            ch = Character.toLowerCase(ch);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Not an alphabet");
            }
        }
    }
