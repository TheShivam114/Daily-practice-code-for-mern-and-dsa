/*Question: Convert Each Word’s First Letter to Uppercase (Title Case Conversion)

You are given a string s containing lowercase letters, spaces, and punctuation.
Your task is to convert the first letter of every word to uppercase, while keeping all other characters unchanged.

A word is defined as any sequence of characters separated by spaces.

🔹 Requirements:

You must use StringBuilder for efficient string building.

Convert only the first alphabet character after a space (word start) to uppercase.

Do not change punctuation (, , . , ! etc.).

Do not remove or trim spaces.

If multiple spaces occur together, they must be preserved.

📥 Input Example
hi, i am shivam 

📤 Output Example
Hi, I Am Shivam 
*/
public class stringday5a {
    public static String toUpper(String st){
       StringBuilder sb =new StringBuilder("");
       char ch=Character.toUpperCase(st.charAt(0));
       sb.append(ch);
       
       for(int i=1;i<st.length();i++){
           if(st.charAt(i)==' '&& i<st.length()-1){
               sb.append(st.charAt(i));
               i++;
               sb.append(Character.toUpperCase(st.charAt(i)));
           }
           else{
            sb.append(st.charAt(i));
           }
       }
       return sb.toString();
    }

    public static void main(String[] args){
        String st="hi, i am shivam ";
        
        System.out.println(toUpper(st));
    }
}
