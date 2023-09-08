class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int ans[]=new int[n];
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        for(int i=0;i<n;i++){
            h1.add(A[i]);
            h2.add(B[i]);
            int c=0;
            for(int x:h1){
                if(h2.contains(x)){
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
}