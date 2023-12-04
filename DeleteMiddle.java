import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i < size; i++){
            arr[i] = sc.nextInt();
        }
        deleteMiddle(arr);
    }
    public static void deleteMiddle(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        if(n % 2 == 0){
           int half = n / 2 - 1;
            for(int i = 0; i < n; i++){
                if(i != half){
                    st.push(arr[i]);
                }
            } 
        }
        else{
            int half = n / 2;
            for(int i = 0; i < n; i++){
                if(i != half){
                    st.push(arr[i]);
                }
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>(st);
  
        for(int num: list){
            System.out.print(num+" ");
        }
        
    }
}
