/*
A parentheses string is valid if and only if:

It is the empty string, It can be written as AB (A concatenated with B), where A and B are valid strings, or 
It can be written as (A), where A is a valid string. You are given a parentheses string s. In one move,
you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))". 
Return the minimum number of moves required to make s valid.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = minToadd(str);
        System.out.println(res);
    }
    public static int minToadd(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char cVal = str.charAt(i);
            if(!st.isEmpty() && st.peek() == '(' && cVal == ')'){
                st.pop();
            }
            else{
                st.push(cVal);
            }
        }
        return st.size();
    }
}
