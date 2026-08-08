/*Compress a String (Basic String Compression)

Given a string of repeated characters, compress it:
aaabbccc → a3b2c3
You must use StringBuilder.

Input:
aaabbccc

Output:
a3b2c3

 */
public class stringday4a {
    public static String stringBuilder(String st) {
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for (int i = 0; i < st.length(); i++) {
            if (i < st.length() - 1 && st.charAt(i) == st.charAt(i + 1)) {
                count++;
            } else {
                sb.append(st.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String st = new String("aaabbccc");
        System.out.println(stringBuilder(st));
    }
}
