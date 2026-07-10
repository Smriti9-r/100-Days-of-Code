// Problem: Write a program to check whether a given square matrix is an Identity Matrix. An identity matrix is a square matrix in which all diagonal elements are 1 and all non-diagonal elements are 0.

// Input:
// - First line: integer n representing number of rows and columns
// - Next n lines: n integers each representing the matrix elements

// Output:
// - Print "Identity Matrix" if the matrix satisfies the condition
// - Otherwise, print "Not an Identity Matrix"

// Example:
// Input:
// 3
// 1 0 0
// 0 1 0
// 0 0 1

// Output:
// Identity Matrix
import java.util.*;
public class Day14{
    public void identity_matrix(int[][] arr){
        int r = arr.length;

        boolean identity = true;
        for(int i =0;i<r;i++){
            for(int j = 0;j<r;j++){
                if(i==j){
                    if(arr[i][j]!=1){
                        identity =false;
                    }
                }
                else if(arr[i][j]!=0){
                    identity =false;
                }
               
            }
        }
        if(identity){
            System.out.println("Identity Matrix");
        }
        else{
            System.out.println("Not an Identity Matrix");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        Day14 d = new Day14();
        d.identity_matrix(arr);

    }
}