// Problem: Given an array of integers, rotate the array to the right by k positions.

// Input:
// - First line: integer n
// - Second line: n integers
// - Third line: integer k

// Output:
// - Print the rotated array

// Example:
// Input:
// 5
// 1 2 3 4 5
// 2

// Output:
// 4 5 1 2 3

import java.util.*;
public class Day18{
    public void reverse(int[]arr , int start, int end){
        int left = start;
        int right = end-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[]arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        Day18 d = new Day18();
        d.reverse(arr,0,n);
        d.reverse(arr,0,k);
        d.reverse(arr,k,n);
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }



    }
}