/*
 a
 bc
 def
 ghij
 */

public class print_character_pattern {
    public static void main(String[] args){
        int n=4;
        char ch='A';
        for(int line=1;line<=n;line++){
            for(int loop=1;loop<=line;loop++){
              System.out.print(ch);
              ch++;
            }
            System.out.println();
        }
    }
}
