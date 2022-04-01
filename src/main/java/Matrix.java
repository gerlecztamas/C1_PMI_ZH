import java.util.ArrayList;

public class Matrix {
    public Matrix(){}
    public static int sumOfEvenNumbers(int[][] matrix){
        int sum=0;
        for(int  i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]%2==0){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static ArrayList<Integer> rowsWithZero(int[][] matrix){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                if(matrix[i][j]==0){
                    result.add(i);
                }
            }
        }
        return result;
    }
}
