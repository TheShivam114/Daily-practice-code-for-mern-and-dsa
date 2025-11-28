/*Given an integer N, count how many bits are set to 1 in its binary representation.
You must solve this using bit manipulation only (no converting to string).

Input Format

A single integer N

Output Format

Print the number of set bits in N.

Constraints

0
≤
𝑁
≤
10
18
0≤N≤10
18

Sample Input
13

Sample Output
3 */
public class bitmanipulation_day10a {
    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {// checkout lsb
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = countSetBit(10);
        System.out.println(a);
    }
}
