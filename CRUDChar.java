import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int c = sc.nextInt();
            if(c == 1){
                System.out.println(st.size());
            }
            else if(c == 2){
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    System.out.println(-1);
                }
            }else if(c == 3){
                char ch = sc.next().charAt(0);
                st.push(ch);
            }
            else if(c == 4){
                if(!st.isEmpty()){
                    System.out.println(st.peek());
                }
                else{
                    System.out.println(-1);
                }
            }
        }
    }
}
