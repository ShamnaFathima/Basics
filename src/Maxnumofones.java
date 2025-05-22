
import java.util.Scanner;
class Maxnumofones {
    public static int rowWithMaxOnes(int [][] matrix,int rows,int cols){
        int MaxRowIndex=-1;
        int j=cols-1;
        for(int i=0;i<rows;i++){
            while(j>=0&& matrix[i][j]==1){
                j--;
                MaxRowIndex=i;
            }
        }
        return MaxRowIndex;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter number of cols: ");
        int cols=sc.nextInt();
        int [][] matrix= new int [rows][cols];

        System.out.print("Enter number of matrix elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix [i][j]= sc.nextInt();
            }


        }
        int result= rowWithMaxOnes(matrix,rows,cols);
        System.out.println("Row Index : " + result);

        sc.close();
    }
}