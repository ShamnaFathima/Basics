package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for (int i = 0; i < str.length;i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1] ="shamna";
        System.out.println(Arrays.toString(str));
    }
}
