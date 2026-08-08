/*Write a recursive function printNumbers(int n) that prints all numbers from 1 to n in increasing order.
Your function must use recursion only (no loops allowed).
Demonstrate the output for n = 7.
 */
public class recursion_day2a {
    public static void incOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        incOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
       incOrder(7);
    }
}
