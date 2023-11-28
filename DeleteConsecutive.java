/*
Given a sequence of  N Strings, the task is to check if any two similar words come together then they destroy each other than print  the number of words left in the sequence after this pairwise destruction.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] str = new String[size];
        for(int i = 0; i < size; i++){
            str[i] = sc.next();
        }
        int res = deleteCon(str);
        System.out.println(res);
    }
    public static int deleteCon(String str[]){
        int n = str.length;
        Stack<String> st = new Stack<>();
        for(String word:str){
            if(!st.isEmpty() && st.peek().equals(word)){
                st.pop();
            }
            else{
                st.push(word);
            }
        }
        return st.size();
    }
}
