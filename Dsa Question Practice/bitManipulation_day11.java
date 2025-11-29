/*You are given two integers A (base) and B (exponent).
 Your task is to compute:
 using fast exponentiation (binary exponentiation), which relies on bit manipulation to speed up the computation.
 
 You must implement the solution without using built-in power functions.
 
 Input Format
 
 Two integers: A and B
 
 Output Format
 
 Print a single integer — the value of 
 A^B
 Constraints
 
 . 1 ≤𝐴≤10^9
 . 0≤B≤10^9
 
 Result fits in 64-bit integer.
 
 Sample Input
 3 5
 
 Sample Output
 243
 
 Explanation
 
 Binary of exponent 5 = 101
 So:
 
 Take A = 3
 3^5=3^4*3^1=81*3=243
 =81∗3=243
 Done using checking bits of the exponent. */
public class bitManipulation_day11 {
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){//check lsb
               ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args){
        int a=fastExpo(3, 5);
        System.out.println(a);
    }
}
