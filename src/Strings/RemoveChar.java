package Strings;

public class RemoveChar {
        public static void main(String[] args) {
            String str = "P@yt#on123";
            StringBuilder result = new StringBuilder();

            for (char c : str.toCharArray()) {
                if (Character.isLetter(c)) {
                    result.append(c);
                }
            }

            System.out.println("Alphabets only: " + result.toString());
        }
    }


