import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int k = sc.nextInt();
        removeKDigit(num,k);
    }
    public static void removeKDigit(String str, int k){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char cVal = str.charAt(i);
            while(k > 0 && !st.isEmpty() && st.peek() > cVal ){
                st.pop();
                k--;
            }
            st.push(cVal);
        }
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        if(st.isEmpty()){
            System.out.println("0");
            return;
        }
        int arr[] = new int[st.size()];
        int i = 0;
        while(!st.isEmpty()){
            arr[i] = Character.valueOf(st.pop())-48;
            i++;
        }
        reverse(arr);
        String res = "";
        if(arr[0] != 0){
            res+=arr[0];
        }
        for(int j = 1; j < arr.length; j++){
            res+=arr[j];
        }
        System.out.println(res);
    }
    public static void reverse(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
