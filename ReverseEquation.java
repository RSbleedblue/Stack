import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res = reverseEq(str);
        System.out.println(res);
    }
    public static String reverseEq(String str){
        Stack<String> st = new Stack<>();
        String res = "";
        for(int i = 0; i < str.length(); i++){
            String temp = "";
            if(Character.isDigit(str.charAt(i))){
                while(i < str.length() &&  Character.isDigit(str.charAt(i))){
                    temp += str.charAt(i);
                    i++;
                }
                st.push(temp);
            }
            if(i < str.length()){ 
                String m = "";
                m+=str.charAt(i);
                st.push(m);
            }
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
}
