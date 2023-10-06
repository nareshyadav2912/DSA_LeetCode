class Solution {
    public boolean isValid(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    public void helper(List<String> temp,List<List<String>> ans,String s,int ind){
        if(ind==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isValid(s,ind,i)){
                temp.add(s.substring(ind,i+1));
                helper(temp,ans,s,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        helper(temp,ans,s,0);
        return ans;
    }
}