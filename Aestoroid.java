import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        asteroidCollid(arr);
    }
    public static void asteroidCollid(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && st.peek() < Math.abs(arr[i]) && st.peek() > 0 ){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == Math.abs(arr[i])){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek() < 0){
                    st.push(arr[i]);
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        Collections.reverse(list);
        for(int i : list ){
            System.out.print(i + " ");
        }
    }
}
