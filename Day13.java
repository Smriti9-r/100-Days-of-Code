// Problem: You are given a rectangular matrix of integers. Starting from the outer boundary, traverse the matrix in a clockwise manner and continue moving inward layer by layer until all elements are visited.

// Input:
// - First line: two integers r and c representing the number of rows and columns
// - Next r lines: c integers each representing the matrix elements

// Output:
// - Print all visited elements in the order of traversal, separated by spaces

// Example:
// Input:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9

// Output:
// 1 2 3 6 9 8 7 4 5

// Explanation:
// The traversal begins along the top row, proceeds down the rightmost column, then moves across the bottom row in reverse, and finally goes up the leftmost column. The same pattern repeats for the inner submatrix.


import java.util.*;
public class Day13{
    public void matrix_walk(int[][]arr ){
        int r = arr.length;
        int c = arr[0].length;
        int top = 0;
        int bottom = r-1;
        int left = 0;
        int right = c - 1;
        List<Integer> list = new ArrayList<>();D
        
        while(top<=bottom && left<= right){
            //traverse left to right row
            for(int i =left;i<=right;i++){
                System.out.print(arr[top][i] + " ");
            }

            // traverse top to bottom
            for(int j = top+1;j<=bottom;j++){
                System.out.print(arr[j][right]+ " ");
            }

            //traverse right to left
            if(top<bottom){
                for(int k = right-1;k>=left;k--){
                    System.out.print(arr[bottom][k]+ " ");
                }
            }

            
            //traverse bottom to top
             if (left < right){
                for(int l = bottom-1;l>top;l--){
                    System.out.print(arr[l][top] + " ");
                }
            }
            
            top++;
            bottom--;
            left++;
            right--;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); //rows
        int c = sc.nextInt(); //columns
        int[][] matrix = new int[r][c];
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                matrix[i][j]= sc.nextInt();

            }
        }
        Day13 obj = new Day13();
        obj.matrix_walk(matrix);

        sc.close();



    }

}