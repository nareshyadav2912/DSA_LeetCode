class Solution {
    public int rev(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        int cnt=0;
        HashMap<Long,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            long re=rev(nums[i]);
            long diff=(nums[i]-re)%1000000007;
            if(hm.containsKey(diff)){
                cnt=(cnt%1000000007)+(hm.get(diff)%1000000007);
            }
            hm.put(diff,hm.getOrDefault(diff,0)+1);
        }
        return cnt%1000000007;
    }
}