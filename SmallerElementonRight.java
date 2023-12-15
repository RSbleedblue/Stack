import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        nextSmallerToRight(arr,size);
    }
    public static void nextSmallerToRight(int arr[],int n){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() > arr[i]){
                st.pop();
            }
            if(!st.isEmpty() && st.peek()<arr[i]){
                ans[i] = st.peek();
            }
            else{
                ans[i] = -1;
            }
            st.push(arr[i]);
        }
        for(int num : ans){
            System.out.print(num+" ");
        }
        
    }
}
