package Strings;

public class RepalceBracklets {
        public static void main(String[] args) {
            String str = "((a + b) * c)";
            String result = str.replaceAll("[()]", "");
            System.out.println("String without brackets: " + result);
        }
    }



