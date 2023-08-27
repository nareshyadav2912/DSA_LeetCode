class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        //System.out.println(moves.length());
        int l=0,r=0,x=0;
        int ans=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L') l++;
            else if(moves.charAt(i)=='R') r++;
            else x++;
            ans=Math.max(l,r)-Math.min(l,r);
        }
        return ans+x;
    }
}