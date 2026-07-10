// Problem: Given integers a and b, compute a^b using recursion without using pow() function.

// Input:
// - Two space-separated integers a and b

// Output:
// - Print a raised to power b

// Example:
// Input:
// 2 5

// Output:
// 32

// Explanation: 2^5 = 2 * 2 * 2 * 2 * 2 = 32
import java.util.*;
class power{
    public int pow(int a, int b){
        if(b==0){
            return 1;
        }
        else if(b== 1){
            return a;
        }
        else{
            return a*pow(a,b-1);
        }
    }
}
public class Day8{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        power p = new power();

        System.out.println(p.pow(a,b));
        sc.close();
    }


}