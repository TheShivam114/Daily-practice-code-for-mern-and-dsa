/*Write a recursive function factorial(int n) that returns the factorial of n, defined as:
𝑛!=𝑛×(𝑛−1)! and 0!=1 

Your function must use recursion.
Calculate the value of factorial(6) using your function. */
public class recursion_day2b {
    public static int factorial(int n){
        if(n==0){//base case
            return 1;
        }
        int fnm1=factorial(n-1);//for n-1
        int fn=n*factorial(n-1);//calculate //fnm1 
        return fn;
    }
    public static void main(String[] args){
       System.out.println(factorial(5));
    }
}
