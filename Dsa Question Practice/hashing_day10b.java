/*
Store Unique Elements in Sorted Order
You are given n integers. Store them in a TreeSet and print all unique elements in ascending order.
Note:

Duplicate elements should be removed automatically.
null values are not allowed in a TreeSet.
 Input Format
First line: Integer n
Second line: n space-separated integers
 Output Format
Print all unique elements in sorted ascending order.

 Constraints
1 ≤ n ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
*/
import java.util.*;
public class hashing_day10b {
    public static void main(String[] args){
        HashSet<String>cities=new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("noida");
        cities.add("bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
         lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("noida");
        lhs.add("bengaluru");
        System.out.println(lhs);

        TreeSet<String> ts=new TreeSet<>();
        ts.add("delhi");
        ts.add("mumbai");
        ts.add("noida");
        ts.add("bengaluru");
        System.out.println(ts);
    }
}
