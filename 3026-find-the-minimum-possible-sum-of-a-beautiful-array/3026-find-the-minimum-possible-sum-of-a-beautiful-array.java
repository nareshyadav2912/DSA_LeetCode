class Solution {
    public long minimumPossibleSum(int n, int target) {
        HashSet<Integer> hs=new HashSet<>();
        int num=1;
        int c=0;
        while(c<n){
            if(!hs.contains(target-num)){
                hs.add(num);
                num++;
                c++;
            }
            else{
                num++;
            }
        }
        long sum=0;
        for(int i:hs){
            sum=sum+i;
        }
        return sum;
        
    }
}