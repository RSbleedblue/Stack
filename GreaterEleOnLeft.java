/*
Given an array arr, print the Next Greater Element (NGE) for every element.
The Next greater Element for an element x  is the first greater element on the left side of x in the array. Elements for which no greater element exist, consider the next greater element as -1.
*/

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
        greaterLeft(arr);
    }
    public static void greaterLeft(int arr[]){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            while(!st.isEmpty() && st.peek() < arr[i] ){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            else{
                ans[i] = -1;
            }
            st.push(arr[i]);
        }
        for(int num: ans){
            System.out.print(num+" ");
        }
    }
}
