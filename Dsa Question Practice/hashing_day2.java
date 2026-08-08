/*
Frequency of Elements Using HashMap
You are given an array of integers. Your task is to count the frequency of each element and answer queries about them.

 Operations
You need to process two types of queries:

FREQ x → Print how many times element x appears in the array
EXISTS x → Print true if element x exists in the array, otherwise false
 Input Format
First line: Integer n → size of array
Second line: n space-separated integers
Third line: Integer q → number of queries
Next q lines: queries of type:
FREQ x
EXISTS x
 Output Format
For each query, print the result on a new line
 Constraints
1≤n,q≤10
5
1≤arr[i],x≤10
9
Sample Input
6
1 2 2 3 1 4
5
FREQ 1
FREQ 2
EXISTS 3
EXISTS 5
FREQ 5
Sample Output
2
2
true
false
0
 Explanation
Element 1 appears 2 times
Element 2 appears 2 times
Element 3 exists
Element 5 does not exist
Frequency of 5 = 0
*/
import java.util.*;
public class hashing_day2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int q = sc.nextInt();
        sc.nextLine(); 
        while (q-- > 0) {
            String[] input = sc.nextLine().split(" ");
            String op = input[0];
            int x = Integer.parseInt(input[1]);
            if (op.equals("FREQ")) {
                System.out.println(map.getOrDefault(x, 0));
            } else if (op.equals("EXISTS")) {
                System.out.println(map.containsKey(x));
            }
        }
        sc.close();
    }
}

