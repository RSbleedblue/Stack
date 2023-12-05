import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res = remOutter(str);
        System.out.println(res);
    }
    public static String remOutter(String str){
        Stack<Character> st = new Stack<>();
        String res = "";
        for(int i = 0; i < str.length(); i++){
            char cVal = str.charAt(i);
            if(cVal == '('){
                if(!st.isEmpty()){
                    res += cVal;
                }
                st.push(cVal);
            }
            else if(cVal == ')'){
                st.pop();
                if(!st.isEmpty()){
                    res+= cVal;
                }
            }
        }
        return res;
       
    }
}
