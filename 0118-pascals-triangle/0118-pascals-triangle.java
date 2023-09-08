class Solution {
    public List<Integer> row(int n){
        List<Integer> l=new ArrayList<>();
        int ans=1;
        l.add(ans);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            l.add(ans);
        }
        return l;
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(row(i));
        }
        return ans;
    }
}