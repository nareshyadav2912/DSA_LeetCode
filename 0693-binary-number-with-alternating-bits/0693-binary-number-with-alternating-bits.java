class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        boolean ans=true;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                ans=false;
                break;
            }
        }
        System.out.println(s);
        return ans;
    }
}