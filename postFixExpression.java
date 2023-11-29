import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = postfix(str);
        System.out.println(result);
    }
    public static int postfix(String str){
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }
            else{
                int top1 = st.pop();
                int top2 = st.pop();
                int ans = 0;
                if(ch == '+'){
                    ans = top2 + top1;
                }
                else if(ch == '-'){
                    ans = top2 - top1;
                }
                else if(ch == '*'){
                    ans = top2 * top1;
                }
                else {
                    ans = top2 / top1;
                }
                st.push(ans);
            }
        }
        return st.peek();
    }
}
