/*
3. Multiply Strings
Medium
Topics
premium lock icon
Companies
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
 

Constraints:

1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.

*/
   class leetcode_day14 {

    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length();
        int m = num2.length();

        int[] result = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {

            for (int j = m - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;

                int position1 = i + j;
                int position2 = i + j + 1;

                int sum = product + result[position2];

                result[position2] = sum % 10;
                result[position1] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int digit : result) {

            if (sb.length() == 0 && digit == 0) {
                continue;
            }

            sb.append(digit);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        leetcode_day14 obj = new leetcode_day14();

        String num1 = "123";
        String num2 = "456";

        String answer = obj.multiply(num1, num2);

        System.out.println(answer);
    }
}