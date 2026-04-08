import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n = matrix.length;

        // Spiral Print
        int top=0, bottom=n-1, left=0, right=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++) System.out.print(matrix[top][i]+" ");
            top++;
            for(int i=top;i<=bottom;i++) System.out.print(matrix[i][right]+" ");
            right--;
            for(int i=right;i>=left;i--) System.out.print(matrix[bottom][i]+" ");
            bottom--;
            for(int i=bottom;i>=top;i--) System.out.print(matrix[i][left]+" ");
            left++;
        }

        // Diagonal Sum
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += matrix[i][i];
            if(i != n-i-1)
                sum += matrix[i][n-i-1];
        }

        System.out.println("\nDiagonal Sum = " + sum);
    }
}