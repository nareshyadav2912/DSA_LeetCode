//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
     
      Solution obj = new Solution();
      boolean ans = obj.checkSubsequenceSum(n,a,k);
      System.out.println(ans?"Yes":"No");
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public static boolean check(int ind,int[] arr,int k,int sum,int n,List<Integer> ds){
        if(ind==n){
            if(sum==k){
                return true;
            }
            else{
                return false;
            }
        }
        if(sum>k) return false;
        ds.add(arr[ind]);
        sum=sum+arr[ind];
        if(check(ind+1,arr,k,sum,n,ds)) return true;
        sum=sum-arr[ind];
        ds.remove(ds.size()-1);
        if(check(ind+1,arr,k,sum,n,ds)) return true;
        return false;
    }
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        return check(0,arr,K,0,N,new ArrayList<>());
  }
}
     