// Problem: Write a program to perform addition of two matrices having the same dimensions. The sum of two matrices is obtained by adding corresponding elements of the matrices.

// Input:
// - First line: two integers m and n representing the number of rows and columns
// - Next m lines: n integers each representing the elements of the first matrix
// - Next m lines: n integers each representing the elements of the second matrix

// Output:
// - Print the resultant matrix after addition, with each row on a new line and elements separated by spaces

// Example:
// Input:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// 9 8 7
// 6 5 4
// 3 2 1

// Output:
// 10 10 10
// 10 10 10
// 10 10 10

// Explanation:
// Each element of the result matrix is the sum of the corresponding elements from the two input matrices.
import java.util.*;
public class Day11{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //rows
        int m = sc.nextInt(); //columns
        int[][] a = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                a[i][j]=sc.nextInt();

            }
        }
        int[][] b = new int[n][m];
        for(int k =0;k<n;k++){
            for(int r =0;r<m;r++){
                b[k][r]=sc.nextInt();

            }
        }

        int[][] result = new int[n][m];
        //addition
        for(int t=0;t<n;t++){
            for(int u = 0;u<m;u++){
                result[t][u] = a[t][u] + b[t][u];

            }
        }

        //print
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}