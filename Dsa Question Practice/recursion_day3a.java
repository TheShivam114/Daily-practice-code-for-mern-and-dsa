/*Write a recursive function fibonacci(int n) to compute the n-th Fibonacci number, where the sequence is defined as:

F(0)=0,F(1)=1,F(n)=F(n−1)+F(n−2)

(a) Using your recursive function, find the value of F(8).
(b) Also print the first n Fibonacci numbers using recursion for n = 7. */
public class recursion_day3a {
    public static int fibonacci(int n){
           if(n==0||n==1){
            return 1;
           }
        int fnm1=fibonacci(n-1);
        int fnm2=fibonacci(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void main(String [] args ){
       System.out.println(fibonacci(8));
       System.out.println(fibonacci(7));

    }
}
