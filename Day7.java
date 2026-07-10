// Problem: Write a recursive function fib(n) to compute the n-th Fibonacci number where fib(0)=0 and fib(1)=1.

// Input:
// - Single integer n

// Output:
// - Print the n-th Fibonacci number

// Example:
// Input:
// 6

// Output:
// 8

// Explanation: Sequence: 0,1,1,2,3,5,8 at positions 0,1,2,3,4,5,6
import java.util.*;

class series {

    public int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        series s = new series();
        for(int i = 0; i <= n; i++){
            System.out.print(s.fibo(i) + " ");
        }
    }
    
}