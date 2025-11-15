/*
 Find the Largest String (Lexicographically) — Coding Question

 Problem Statement

You are given N strings.
Your task is to print the string that is largest in lexicographical order (dictionary order).

Lexicographical order is the same way words are arranged in a dictionary.
For example:
"mango" > "banana" because 'm' comes after 'b'.

Input Format

First line: Integer N — number of strings

Next N lines: Each contains one string
 */

public class stringday3a {
    public static void lexicographical(String fruit[]){
        String larger=fruit[0];
        for(int i=1;i<fruit.length;i++){
            if(larger.compareTo(fruit[i])<0){
                larger=fruit[i];
            }
        }
        System.out.println(larger);
    }
    public static void main(String[] args){
        String st[]={"apple","mango","banana"};
    lexicographical(st);
    }
    
}
