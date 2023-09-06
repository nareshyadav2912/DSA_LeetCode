//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printGfg(n);
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    void fun(int i,int n){
        if(i>n) return;
        System.out.print("GFG"+" ");
        fun(i+1,n);
    }
    void printGfg(int N) {
        // code here
        fun(1,N);
    }
}