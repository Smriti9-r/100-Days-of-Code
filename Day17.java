// Problem: Write a program to find the maximum and minimum values present in a given array of integers.

// Input:
// - First line: integer n
// - Second line: n integers

// Output:
// - Print the maximum and minimum elements

// Example:
// Input:
// 6
// 3 5 1 9 2 8

// Output:
// Max: 9
// Min: 1
import java.util.*;
public class Day17{
    public void maximum(int[]arr){
        int n = arr.length;
        int max =arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        System.out.println("Max" + " "+ max);
    }

    public void minimum(int[]arr){
        int n = arr.length;
        int min= arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]<=min){
                min= arr[i];
            }
        }
        System.out.println("Min" + " "+ min);

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Day17 d = new Day17();
        d.minimum(arr);
        d.maximum(arr);

    }

}