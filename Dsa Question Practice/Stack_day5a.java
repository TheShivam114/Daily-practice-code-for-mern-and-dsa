/*You are given an array prices[] of size N, where each element represents the price of a stock on a given day.
The stock span of a day is defined as the maximum number of consecutive days (including the current day) just before the given day for which the stock price was less than or equal to the price on the current day.
Task
Write a program to compute the stock span for each day using a stack-based approach.
Input
An integer N representing the number of days
An integer array prices[] of size N containing stock prices
Output
An integer array span[] of size N, where span[i] denotes the stock span of day i
Example
Input:
N = 7
prices = [100, 80, 60, 70, 60, 85, 100]

Output:
span = [1, 1, 1, 2, 1, 5, 7]
Explanation
On day 0 (price = 100), no previous days exist → span = 1
On day 3 (price = 70), prices of days 2 and 3 are ≤ 70 → span = 2
On day 6 (price = 100), all previous prices are ≤ 100 → span = 7
Constraints
1 ≤ N ≤ 10^5
1 ≤ prices[i] ≤ 10^6
Expected Time Complexity
O(N) using a stack
Expected Space Complexity
O(N) for the stack */
import java.util.*;
public class Stack_day5a {
    public static void Stockspan(int stock[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stock.length;i++){
            int currprice=stock[i];
             while (!s.isEmpty()&&currprice>stock[s.peek()]) {
                s.pop();

             }
             if(s.isEmpty()){
                span[i]=i+1;

             }
             else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;

             }
             s.push(i);
        }
    }
    public static void main(String[] args){
      int stock[]={100,80,60,70,80};
      int span[] =new int [stock.length];
      Stockspan(stock,span);
      for(int i=0;i<span.length;i++){
        System.out.println(span[i]+"");
      }
    }
}
 