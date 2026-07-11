// Problem: Given a matrix, calculate the sum of its primary diagonal elements. The primary diagonal consists of elements where row index equals column index.

// Input:
// - First line: two integers m and n
// - Next m lines: n integers each

// Output:
// - Print the sum of the primary diagonal elements

// Example:
// Input:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9

// Output:
// 15

// Explanation:
// 1 + 5 + 9 = 15

import java.util.*;
public class Day15{

    public int  diagonal_sum(int[][]arr){
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;

    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // rows
        int n = sc.nextInt(); //columns
        int[][] arr = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Day15 d = new Day15();
        System.out.println("Sum of diagonals"+" "+ d.diagonal_sum(arr));

    }
}