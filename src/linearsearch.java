import com.sun.jdi.PathSearchingVirtualMachine;

public class linearsearch {
    public static int linearSearch(int[]arr,int target){
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target) {
                System.out.println("target found");
                return arr[i];
            }
        }
            System.out.println("target not found");
            return -1;
        }
        public static void main(String[] args)
        {
            int[] arr={5,7,9,11,3};
            int target=11;
            int result=linearSearch(arr,target);
            System.out.println();
        }
    }

