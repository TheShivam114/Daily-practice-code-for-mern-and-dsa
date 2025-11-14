/*Problem Statement

You are given a string S and two integers L and R.
Your task is to:

1.Extract the substring of S from index L to index R (both inclusive).

2.Print this substring.

3.Then determine whether this extracted substring appears again anywhere else in the string S outside the range [L, R].

4.If it appears again, print "YES"; otherwise print "NO".

You must solve this using Java substring() and/or charAt() methods.*/
public class stringday2b {
    public static  String substring(String s, int l, int r){
        String sub=" ";
        for(int i=l;i<r;i++){
            sub+=s.charAt(i);
        }
        return sub;


    }
    public static void main(String[] args){
        String s="hellow";
        System.out.println(substring(s,0,4));
        
    }
}
