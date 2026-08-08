/*
 Build String From Characters (Fast Input)

You are given N characters.
Using StringBuilder, build the final string and print it.

Example
Input:
a p p l e


Output:
apple
 */

 import java.util.*;
public class stringday4b {
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String ch = sc.next(); 
            sb.append(ch);
        }

        System.out.println(sb.toString());
    
}

}
