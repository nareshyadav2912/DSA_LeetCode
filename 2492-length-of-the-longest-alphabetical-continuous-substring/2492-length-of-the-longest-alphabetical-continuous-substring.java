class Solution {
    public int longestContinuousSubstring(String s) {
        String str="abcdefghijklmnopqrstuvwxyz";
        int len=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            if(str.contains(s.substring(k,i+1))){
                len=Math.max(len,(s.substring(k,i+1).length()));
            }
            else{
                k=i;
            }
        }
        return len;

    }
}