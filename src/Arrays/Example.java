package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 234;
        arr[3] = 31;
        arr[4] = 987;
        //[ 23,45,234,31,987]
        System.out.println(arr[3]);

//        //input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length; i++){
//            System.out.println(arr[i]+" ");
//        }
//        for(int num : arr){
//            System.out.print(num+" "); //here the num represents element of the array
//        }
//        System.out.println(arr[5]); //index out of bound error

        // Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length;i ++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}

