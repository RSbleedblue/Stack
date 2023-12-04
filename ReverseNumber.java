import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i = 0; i < testCase; i++){
            int n = sc.nextInt();
            int reverse = reverseNumber(n);
            System.out.println(reverse);
        }
    }
    public static int reverseNumber(int n){
        Stack<Integer> st1 = new Stack<>();
        while(n > 0){
            int temp = n % 10;
            st1.add(temp);
            n = n / 10;
        }
        Stack<Integer> st = new Stack<>();
        while(!st1.isEmpty()){
            st.push(st1.pop());
        }
        
        int res = 0;
        while(!st.isEmpty()){
            if(st.peek() != 0){
                while(!st.isEmpty()){
                    res = (res * 10) + st.pop();
                }
            }
            else{
                st.pop();
            }
        }
        return res;
    }
}
