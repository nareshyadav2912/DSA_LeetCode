class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        int x=1;
        for(int i=0;i<target.length;i++){
            ans.add("Push");
            if(target[i]!=x){
                ans.add("Pop");
                i--;
            }
            x++;
        }
        return ans;
    }
}