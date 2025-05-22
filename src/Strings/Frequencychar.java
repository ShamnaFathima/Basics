package Strings;

public class Frequencychar {
    public static void main(String[] args) {
        String str = "hello";
        int[] count = new int[256]; // ASCII size

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        System.out.println("Character Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + ": " + count[i]);
            }
        }
    }
}

