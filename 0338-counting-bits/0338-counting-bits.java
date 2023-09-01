class Solution {
    public int cnt(int n){
        String s=Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') c++;
        }
        return c;
    }
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        int ind=0;
        for(int i=0;i<=n;i++){
            //System.out.println(cnt(i));
            ans[ind++]=cnt(i);
        }
        return ans;
    }
}