// Problem: Write a program to check whether a given matrix is symmetric. A matrix is said to be symmetric if it is a square matrix and is equal to its transpose (i.e., element at position [i][j] is equal to element at position [j][i] for all valid i and j).

// Input:
// - First line: two integers m and n representing the number of rows and columns
// - Next m lines: n integers each representing the elements of the matrix

// Output:
// - Print "Symmetric Matrix" if the given matrix is symmetric
// - Otherwise, print "Not a Symmetric Matrix"

// Example:
// Input:
// 3 3
// 1 2 3
// 2 4 5
// 3 5 6

// Output:
// Symmetric Matrix

// Test Case 2:
// Input:
// 3 3
// 1 0 1
// 2 3 4
// 1 4 5
// Output:
// Not a Symmetric Matrix


// Explanation:
// The matrix is square (3 × 3) and for every i and j, element[i][j] = element[j][i].

import java.util.*;
public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //rows
        int m = sc.nextInt(); //columns
        int[][] a = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                a[i][j]= sc.nextInt();
            }
        }

        //checking symmetricity
        if(n!=m){
            System.out.println("Not a Symmetric matrix");
            return;
        }

        boolean isSymmetric = true;

        for(int i = 0;i<n;i++){
            for(int j = i+1;j<m;j++){
                if(a[i][j]!=a[j][i]){
                    isSymmetric = false;
                }
                if(!isSymmetric){
                    break;
                }
            }
        }
        if(isSymmetric){
            System.out.println("Symmetric matrix");
        }
        else{
            System.out.println("Not symmetric");
        }
    }
    
}
