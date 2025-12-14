/*Write a recursive function power(int x, int n) that calculates the value of
𝑥^𝑛
using recursion only (no loops allowed).
Use your function to compute the value of:
2^10 */
public class recursion_day5a {
    public static int power(int x,int n)
    {
        if(n==0){
            return 1;
        }
        int xnm1=power(x, n-1);
        int xn=x*xnm1;
        return xn;
    }
    public static void main(String[] args){
           System.out.println(power(2, 10));
    }
}
